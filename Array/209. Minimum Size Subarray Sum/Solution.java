/**
Problem Solver: Gordon Fang
Method: Brute Force
Time Complexity: O(n^2)
Runtime: 118 ms, faster than 7.36% of Java online submissions for Minimum Size Subarray Sum.
Memory Usage: 38.8 MB, less than 77.51% of Java online submissions for Minimum Size Subarray Sum.
Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 

Constraints:

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 105
 

Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).
 */
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int subArraySize = this.helper(target, nums, i);
            subArraySize = subArraySize == 0 ? result : subArraySize;
            result = subArraySize < result ? subArraySize : result;
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
    
    private int helper(int target, int[] nums, int begin) {
        int sum = 0;
        for(int i = begin; i < nums.length; i++) {
            sum += nums[i];
            if(sum >= target) {
                return i - begin + 1;
            }
        }
        return 0;
    }
}