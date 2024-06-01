package SlidingWindowTwoPointer;

/*
1004. Max Consecutive Ones III
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(calculate(nums, k));
    }

    public static int calculate(int[] nums, int k) {

        int l = 0;
        int r = 0;
        int maxLength = 0;
        int zeros = 0;

        while (r < nums.length) {

            if (nums[r] == 0) {
                zeros++;
            }

            if (zeros <= k) {
                maxLength = Integer.max(maxLength, r - l + 1);
            }

            if (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
            r++;
        }
        return maxLength;
    }
}
