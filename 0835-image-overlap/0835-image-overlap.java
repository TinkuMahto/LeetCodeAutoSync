class Solution {

    private int countOverlap(int[][] img1, int[][] img2, int rowOff, int colOff){
        int count = 0;
        int n = img1.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

                int img2_i = i + rowOff;
                int img2_j = j + colOff;

                if(img2_i < 0 || img2_i >= n || img2_j < 0 || img2_j >= n ){
                    continue;
                }
                if(img1[i][j] == 1 && img2[img2_i][img2_j] == 1){
                    count++;
                }
            }
        }
        return count;
    }

    
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int maxOverlap = 0;

        for(int rowOff = -n+1; rowOff < n; rowOff++){
            for(int colOff = -n+1; colOff < n; colOff++){
                int count = countOverlap(img1, img2, rowOff, colOff);
                maxOverlap = Math.max(maxOverlap, count);
            }
        }

        return maxOverlap;
    }
}