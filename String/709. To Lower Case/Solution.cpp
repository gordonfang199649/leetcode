/*
Problem Solver: gordon fang
Method: Iterative Method
Time Complexity: O(n)
Runtime: 0 ms, faster than 100.00% of C++ online submissions for To Lower Case.
Memory Usage: 6.2 MB, less than 31.78% of C++ online submissions for To Lower Case.


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
#include <string>
using namespace std;
class Solution {
public:
    string toLowerCase(string s) {
        for(int i = 0; i < s.size(); i++) {
            if( 'A' <= s[i] && s[i] <= 'Z' ) {
                s[i] = (int) s[i] + 32;
            }
        }
        return s;
    }
};