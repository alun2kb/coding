public class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] != newColor)
            dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public void dfs(int[][] image, int x, int y, int judge, int newColor){
        if(x < 0 || y < 0 || x >= image.length || y >= image[0].length || image[x][y] != judge || image[x][y] == newColor)
            return;
        image[x][y] = newColor;
        //print(image);
        dfs(image, x + 1, y, judge, newColor);
        dfs(image, x - 1, y, judge, newColor);
        dfs(image, x, y + 1, judge, newColor);
        dfs(image, x, y - 1, judge, newColor);
        return;
    }
}
