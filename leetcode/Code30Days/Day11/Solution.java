package leetcode.Code30Days.Day11;

import algorythms.tree.*;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public static int ans;

    public static int diameterOfBinaryTree(Node root) {
        ans = 1;
        diameter(root);
        return ans - 1;
    }

    public static int diameter(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = diameter(node.left);
            int rightHeight = diameter(node.right);
            ans = Math.max(ans, leftHeight + rightHeight + 1);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}