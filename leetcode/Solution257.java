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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root, null, ans);
        return ans;
    }

    public void dfs(TreeNode treeNode, String s, List<String> ans) {
        if(treeNode == null)
            return;
        
        if(s == null)
            s = Integer.toString(treeNode.val);
        else
            s = s + "->" + Integer.toString(treeNode.val);
        
        if(treeNode.right == null && treeNode.left == null) {    // 叶子节点
            ans.add(s);
            return;
        }
        
        dfs(treeNode.left, s, ans);
        dfs(treeNode.right, s, ans);
    }
}
