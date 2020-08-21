class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    // 树的遍历
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int ans = Integer.MAX_VALUE;
        if (root.left != null) {
            ans = Math.min(minDepth(root.left), ans);
        }
        if (root.right != null) {
            ans = Math.min(minDepth(root.right), ans);
        }
        return ans + 1;
    }
}
