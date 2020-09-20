// 讨论子问题，每个数无非是放或者不放
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        dfs(0, nums, ans, new ArrayList<Integer>());
        return ans;
    }

    public void dfs(int step, int nums[], List<List<Integer>> ans, List<Integer> perm) {
        if(step == nums.length)
        {
            System.out.println(perm.size());
            ans.add(new ArrayList<Integer>(perm));
            return;
        }
        dfs(step + 1, nums, ans, perm);
        perm.add(nums[step]);
        dfs(step + 1, nums, ans, perm);
        int pos = perm.size() - 1;
        perm.remove(pos);
    }
}
