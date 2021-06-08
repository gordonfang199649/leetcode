/*
Runtime: 1 ms, faster than 98.50% of Java online submissions for Maximum Depth of N-ary Tree.
Memory Usage: 45.6 MB, less than 68.29% of Java online submissions for Maximum Depth of N-ary Tree.
author: gordon fang
time complexity: O(N) 

Task description
Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

For example, given a 3-ary tree:
        1
      / | \
     2  3  4
    / \
   5   6


 

We should return its max depth, which is 3.

 

Note:

The depth of the tree is at most 1000.
The total number of nodes is at most 5000.
 


*/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
import static java.lang.Math.max;

class Solution {
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        int max = 1;
        for(Node node : root.children){
            max = Math.max(maxDepth(node)+1, max);
        }
        return max;
    }
}