class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid[0].length;
        int[][] result = new int[n - 2][n - 2];
        int len = n - 2;

        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                int currI = i + 1;
                int currJ = j + 1;

                int[] dirX = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
                int[] dirY = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

                int max = 0;
                for(int k = 0; k < 9; k++){
                    max = Math.max(max, grid[currI + dirX[k]][currJ + dirY[k]]);
                }
                result[i][j] = max;
            }
        }

        return result;        
    }
}