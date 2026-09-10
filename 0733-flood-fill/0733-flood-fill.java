class Solution {

    int temp;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        temp = image[sr][sc];
        dfs(image, sr, sc, color);
        return image;
    }


    private void dfs(int[][] image, int sr, int sc, int color){
        if(sr < 0 || sr >= image.length || sc < 0 || 
            sc >= image[0].length || image[sr][sc] == color){
                return;

        }
        if(image[sr][sc] != temp){
            return;
        }
        image[sr][sc] = color;

        dfs(image, sr + 1, sc, color);
        dfs(image, sr - 1, sc, color);
        dfs(image, sr, sc + 1 , color);
        dfs(image, sr, sc - 1 , color);
         
    }
}