/*
Runtime: 4 ms, faster than 82.99% of C online submissions for Longest Substring Without Repeating Characters.
Memory Usage: 5.9 MB, less than 71.01% of C online submissions for Longest Substring Without Repeating Characters.
problem solver: E=EE

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
int lengthOfLongestSubstring(char * s){
    char* p = s;
    int max = 0;
    int counter[256] = {0};
    while(*s != 0) {
        counter[(char)*s]++;
        if(counter[(char)*s] > 1) {
            while(p<s  && counter[(char)*s]>1) {
                counter[(char)*p]--;
                p++;
            }
        }
        s++;
        max = s-p > max ? s-p : max;
    }
    return max;
}