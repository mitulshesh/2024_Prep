package SlidingWindowTwoPointer;

import java.util.HashMap;
import java.util.Map;
/*
3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */

public class LongestSubstringWithoutRepeat {

    public static void main(String[] args) {
        System.out.println(longestSequence("tmmzuxt"));
    }
    public static int longestSequence(String s) {

        int l = 0;
        int r = 0;
        int maxLength = 0;
        //In order to store all the entries to keep track of already visited ones
        Map<Character, Integer> store = new HashMap<>();

        while (r < s.length()) {
            if (!store.containsKey(s.charAt(r))) {
                store.put(s.charAt(r), r);
            } else {
                if(store.get(s.charAt(r)) >= l) {
                    l = store.get(s.charAt(r)) + 1;
                }
                    store.put(s.charAt(r), r);
            }
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        return maxLength;
    }
}
