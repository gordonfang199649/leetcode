/*
Problem Solver: Gordon Fang
Runtime: 0 ms, faster than 100.00% of C++ online submissions for Backspace String Compare.
Memory Usage: 6.3 MB, less than 57.92% of C++ online submissions for Backspace String Compare.

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a##c", t = "#a#c"
Output: true
Explanation: Both s and t become "c".
Example 4:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 

Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.
 

Follow up: Can you solve it in O(n) time and O(1) space?
*/

#include <string>
class Solution {
public:
    bool backspaceCompare(string s, string t) {
        return removeBackSpaces(s).compare(removeBackSpaces(t)) == 0;
    }
private:
    string removeBackSpaces(string str) {
        string newString;
        int skip = 0;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str[i] == '#') {
                skip++;
            } else {
                if(skip > 0) {
                    skip--;
                } else {
                    newString.push_back(str[i]);
                }               
            }
        }
        return newString;
    }
};