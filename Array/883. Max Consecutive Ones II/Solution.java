/**
 * 259 ms時間消耗 · 16.46 MB空間消耗 · 您的提交打敗了87.80 %的提交
 * 
 * time Complexity: O(n) problem solver: Gordon Fang
 * 
 * 描述 給出一個二進制數組，在最多翻轉一位0的情況下，找到這個數組裡最長的連續的1的個數。
 * 
 * 輸入數組只含有0和1。 數組的長度是一個正整數，並且長度不會超過10,000。 樣例 样例 1: 输入: nums = [1,0,1,1,0] 输出: 4
 * 
 * 解释: 反转第一个0可以得到4个连续的1。
 * 
 * 样例 2: 输入: nums = [1,0,1,0,1] 输出: 3
 * 
 * 解释: 无论反转哪个0都最多得到3个1.
 * 
 * 
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int count = 0;
        int max = 0;
        for (int num : nums) {
            count++;
            if (num == 0) {
                current = count;
                count = 0;
            }
            int total = current + count;
            max = max < total ? total : max;
        }
        return max;
    }
}