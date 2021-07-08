/*
Runtime: 4 ms, faster than 87.25% of Java online submissions for Longest Substring Without Repeating Characters.
Memory Usage: 39.1 MB, less than 59.66% of Java online submissions for Longest Substring Without Repeating Characters.
problem solver: gordon fang


Task description
Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"
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