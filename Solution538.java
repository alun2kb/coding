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
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        postOrder(root);
        return root;
    }

    public TreeNode postOrder(TreeNode root) {
        if(root == null) {
            return root;
        }
        postOrder(root.right);
        sum += root.val;
        root.val = sum;
        postOrder(root.left);
        
        return root;
    }
}
