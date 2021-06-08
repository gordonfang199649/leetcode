/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
Memory Usage: 44.5 MB, less than 98.54% of Java online submissions for Range Sum of BST.
author: gordon fang
time complexity: O(N) 

Task description
Given a binary tree, determine if it is a complete binary tree.

Definition of a complete binary tree from Wikipedia:
In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

 

Example 1:
        1
       / \
      2   3
     / \  /
    4   5 6   

Input: [1,2,3,4,5,6]
Output: true
Explanation: Every level before the last is full (ie. levels with node-values {1} and {2, 3}), and all nodes in the last level ({4, 5, 6}) are as far left as possible.
Example 2:
        1
       / \
      2   3
     / \   \
    4   5   7   


Input: [1,2,3,4,5,null,7]
Output: false
Explanation: The node with value 7 isn't as far left as possible.
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        int tree_size = numberNode(root);
        int idx = 0;
        return checker(root, idx, tree_size);
    }
    
    public int numberNode(TreeNode node){
        if(node==null)
            return 0;
        return (1 + numberNode(node.left)+numberNode(node.right));
    }
    
    public boolean checker(TreeNode node, int idx, int tree_size){
        if(node==null)
            return true;
        if(idx>=tree_size)
            return false;
        return checker(node.left, 2*idx+1, tree_size) && checker(node.right, 2*idx+2, tree_size);
    }
}