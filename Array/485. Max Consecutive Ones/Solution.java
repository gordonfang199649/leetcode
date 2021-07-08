/**
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Max
 * Consecutive Ones. Memory Usage: 40.6 MB, less than 31.19% of Java online
 * submissions for Max Consecutive Ones.
 * 
 * time complexity: O(n)
 * problem solver: Gordon Fang
 * 
 * Given a binary array nums, return the maximum number of consecutive 1's in
 * the array.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or
 * the last three digits are consecutive 1s. The maximum number of consecutive
 * 1s is 3. Example 2:
 * 
 * Input: nums = [1,0,1,1,0,1] Output: 2
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 105 nums[i] is either 0 or 1.
 * 
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int num : nums) {
            count++;
            if (num == 0) {
                count = 0;
            }
            max = max < count ? count : max;
        }
        return max;
    }
}