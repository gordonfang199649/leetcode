
/**
 * Runtime: 5 ms, faster than 15.80% of Java online submissions for Max Consecutive Ones III.
Memory Usage: 68.8 MB, less than 5.06% of Java online submissions for Max Consecutive Ones III.

time Complexity: O(n)
algorithm: Sliding Window
problem solver: Gordon Fang

Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.F
0 <= k <= nums.length


 */

import java.lang.Math;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int left = 0;
        int zeros = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[left++] == 0) {
                    zeros--;
                }
            }
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}