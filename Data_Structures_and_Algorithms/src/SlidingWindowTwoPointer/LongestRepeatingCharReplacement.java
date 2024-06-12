package SlidingWindowTwoPointer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class LongestRepeatingCharReplacement {


    public static int logic(String s,int k){

        int l=0,r=0;
        int maxLength = 0;
        int maxFreq = 0;

        Map<Character,Integer> m =new HashMap<>();

        while(r < s.length()){

            if(!m.containsKey(s.charAt(r))){
                m.put(s.charAt(r),1);
            }else{
                m.put(s.charAt(r),m.get(s.charAt(r))+1);
            }

            Optional<Integer> maxVal = m.values().stream().sorted().max((i1,i2)->i1.compareTo(i2));

            maxFreq = maxVal.get();

            //check if valid segment
            if( (r - l + 1) - maxFreq <= k){
                maxLength = Math.max(r-l+1,maxLength);
            }else{
                m.put(s.charAt(l),m.get(s.charAt(l))-1);
                l++;
            }
            r++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(logic("AAABBCCD",2));
    }
}
