package SlidingWindowTwoPointer;

import java.util.HashMap;
import java.util.Map;


/*
Find the longest substring with at most k distinct chars
 */

public class longestSubsKDistinctChars {

    public static void main(String[] args) {

        String input = "abcdcccccab";
        int k = 3;
        System.out.println(longestSubs(input,k));
    }

    public static int longestSubs(String input,int k){

        int l = 0;
        int r = 0;
        Map<Character,Integer> map = new HashMap<>();
        int maxLength = 0;
        while(r < input.length()){
            if(map.containsKey(input.charAt(r))){
                map.put(input.charAt(r), map.get(input.charAt(r))+1);
            }else {
                map.put(input.charAt(r),1);
            }

            if(map.size()<=k){
                maxLength = Math.max(r-l+1,maxLength);
            }else{
                map.put(input.charAt(l),map.get(input.charAt(l))-1);
                if(map.get(input.charAt(l)) == 0){
                    map.remove(input.charAt(l));
                }
                l++;
            }
            r++;
        }
        return maxLength;
    }
}
