/*
Runtime: 1 ms, faster than 95.86% of Java online submissions for Jewels and Stones.
Memory Usage: 34.8 MB, less than 99.60% of Java online submissions for Jewels and Stones.
author: gordon fang
time complexity: O(N+M) 

Task description
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.
*/
import java.util.HashSet;
class Solution {
    public int numJewelsInStones(String J, String S) {
        int count =0;
        char [] jewels = J.toCharArray();
        char [] stones = S.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        
        for(int i = 0 ; i<J.length() ; i++)
            set.add(jewels[i]);
        
        for(int j = 0 ; j<S.length() ; j++)
            if(set.contains(stones[j]))
                count++;
        
        return count;
    }
}