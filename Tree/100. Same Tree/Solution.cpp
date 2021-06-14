/**
Problem Solver: Gordon Fang
Method: Recursive Method
Runtime: 4 ms, faster than 46.98% of C++ online submissions for Same Tree.
Memory Usage: 10 MB, less than 75.83% of C++ online submissions for Same Tree.

Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false
 

Constraints:

The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
*/

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if(!p && !q) return true;
        
        if(!p || !q) return false;
        
        if(p->val == q->val)
            return isSameTree(p->left,q->left) && isSameTree(p->right,q->right);
         
        return false;
        
    }
};