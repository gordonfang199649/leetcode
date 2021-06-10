/**
Problem Solver: Gordon Fang
Method: Iterative Method
Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
Memory Usage: 39 MB, less than 85.85% of Java online submissions for Move Zeroes.
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you minimize the total number of operations done?
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        for(int i = 0; i < size; i++){
            if(nums[i] == val){
                for(int j = i + 1; j < size; j++){
                 nums[j-1] = nums[j];
                }
                i--;
                size--;
            }
        }
        return size;
    }
}