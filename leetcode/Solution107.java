import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null)
            return ans;

        //BFS
        queue.offer(root);
        int cnt = 1;
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<Integer>();
            while (cnt > 0) {
                TreeNode now = queue.poll();
                System.out.println(now.val);
                tmp.add(now.val);
                if (now.left != null)
                    queue.offer(now.left);
                if (now.right != null)
                    queue.offer((now.right));
                --cnt;
            }
            cnt = queue.size();
//            System.out.println("cnt -> " + cnt);
            ans.add(0, tmp);    // 逆序插入到表首即可
        }
        return ans;
    }

}
