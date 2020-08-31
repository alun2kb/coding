import java.util.List;

public class Solution {
    boolean[] vis;
    int num;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        num = 0;
        vis = new boolean[n];
        dfs(rooms, 0);
        return num == n;
    }

    public void dfs(List<List<Integer>> rooms, int x)
    {
        if(vis[x])
            return;
        vis[x] = true;
        num++;
        for (int it : rooms.get(x))
            dfs(rooms, it);
    }
}
