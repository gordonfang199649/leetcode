/**
Problem Solver: Gordon Fang
Method: Recursive Method
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
Memory Usage: 51.9 MB, less than 6.37% of Java online submissions for Binary Search.

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 

Constraints:

1 <= nums.length <= 104
-9999 <= nums[i], target <= 9999
All the integers in nums are unique.
nums is sorted in an ascending order.
 */
#include <vector>

class Solution {
public:
    int search(vector<int>& nums, int target) {
        return helper(nums, target, 0, nums.size() - 1);
    }
    
private:
    int helper(vector<int>& nums, int target, int start, int end){
        if(start<=end){
            int mid = (start + end) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                return helper(nums, target, mid + 1, end);
            }

            if(nums[mid] > target){
                return helper(nums, target, start, mid - 1);
            }
        }
        return -1;
    }
};