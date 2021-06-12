/**
Problem Solver: Gordon Fang
Method: Recursive Method
Runtime: 24 ms, faster than 92.35% of C++ online submissions for Squares of a Sorted Array.
Memory Usage: 25.8 MB, less than 95.06% of C++ online submissions for Squares of a Sorted Array.
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
*/
#include <vector>
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int size = nums.size();
        int i =size - 1;
        int j = 0;
        vector<int> answer(size);
        for(int k = size - 1; k>= 0; k--){
            if(abs(nums[j]) > abs(nums[i])) {
                answer[k] = nums[j] * nums[j];
                j++;
            } else {
                answer[k] = nums[i] * nums[i];
                i--;
            }
        }
        return answer;
    }
};