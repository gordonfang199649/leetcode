/**
Problem Solver: Gordon Fang
Method: Stack
Runtime: 1 ms, faster than 66.95% of Java online submissions for Backspace String Compare.
Memory Usage: 37.3 MB, less than 53.55% of Java online submissions for Backspace String Compare.
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
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return removeBackSpaces(s).removeBackSpaces(helper(t));
    }
    
    private String removeBackSpaces(String str){
       Stack<Character> stack = new Stack<>();
       StringBuilder builder = new StringBuilder();
       for(char c : str.toCharArray()){
           if(c == '#') {
               if(!stack.isEmpty()) {
                   stack.pop();
               }
           } else {
               stack.push(c);
           }
       }
       
       while(!stack.isEmpty()){
           builder.append(stack.pop());
       }
       return builder.toString();
    }
}