package Sep19;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, false);
    }

    public int dfs(TreeNode root, boolean judgeLeft) {
        if (root.right == null && root.left == null) {
            if (judgeLeft) {
                return root.val;
            } else {
                return 0;
            }
        }

        int ans = 0;
        if (root.left != null) {
            ans += dfs(root.left, true);
        }
        if (root.right != null) {
            ans += dfs(root.right, false);
        }
        return ans;
    }
}
