/*
Runtime: 4 ms, faster than 87.25% of Java online submissions for Longest Substring Without Repeating Characters.
Memory Usage: 39.1 MB, less than 59.66% of Java online submissions for Longest Substring Without Repeating Characters.
problem solver: gordon fang

Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0
*/
import java.lang.Math;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0; right< s.length(); right++) {
            char sign = s.charAt(right);
            
            if(!set.add(sign)) {
                while(s.charAt(left) != sign) {
                    set.remove(s.charAt(left++));
                }
                left++;
            }
           
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}