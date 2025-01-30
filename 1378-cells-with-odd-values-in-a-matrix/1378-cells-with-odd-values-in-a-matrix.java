class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++) arr[i][j] = 0;
        }

        int len = indices.length;

        for(int i = 0; i < len; i++){
            int r = indices[i][0];
            int c = indices[i][1];

            for(int j = 0; j < n; j++) arr[r][j]++;
            for(int j = 0; j < m; j++) arr[j][c]++;
        }

        int result = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] % 2 == 1) result++;
            }
        }

        return result;
    }
}