class Solution {
    int[] dirX = {0, 1, 0, -1, 1, 1, -1, -1};
    int[] dirY = {1, 0, -1, 0, 1, -1, 1, -1};

    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0], y = click[1];
        if (board[x][y] == 'M')      // 地雷被挖出
            board[x][y] = 'X';
        else                         // 其他情况
            dfs(board, x, y);
        return board;
    }

    public void dfs(char[][] board, int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 8; ++i) {
            int tx = x + dirX[i];
            int ty = y + dirY[i];
            if (tx < 0 || tx >= board.length || ty < 0 || ty >= board[0].length)
                continue;
            if (board[tx][ty] == 'M')
                ++cnt;
        }
        if (cnt > 0)    // 周围至少包括一个炸弹
            board[x][y] = (char) (cnt + '0');
        else {          // 如果无炸弹
            board[x][y] = 'B';
            for (int i = 0; i < 8; ++i) {
                int tx = x + dirX[i];
                int ty = y + dirY[i];
                if (tx < 0 || tx >= board.length || ty < 0 || ty >= board[0].length || board[tx][ty] != 'E')
                    continue;
                dfs(board, tx, ty);
            }
        }
    }
}
