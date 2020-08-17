// https://leetcode-cn.com/problems/balanced-binary-tree/submissions/
public class Solution {
    public int height(TreeNode t) {
        if (t == null)
            return 0;
        else
            return Math.max(height(t.left), height(t.right)) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        else
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
}
