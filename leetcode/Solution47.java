public class Solution {

    boolean[] vis;

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        vis = new boolean[nums.length];
        dfs(0, nums, new ArrayList<Integer>(), ans);
        return ans;
    }

    public void dfs(int step, int[] nums, List<Integer> box, List<List<Integer>> ans) {
        if (step == nums.length) {
            ans.add(new ArrayList<>(box));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if (vis[i] == true || (i > 0 && nums[i] == nums[i - 1] && vis[i - 1] == true)) {
                continue;
            }
            vis[i] = true;
            box.add(nums[i]);
            dfs(step + 1, nums, box, ans);
            box.remove(step);
            vis[i] = false;
        }
    }
}
