class Solution {
    public int islandPerimeter(int[][] grid) {
        int result = 0;

        int lenRow = grid.length;

        for(int i = 0; i < lenRow; i++){
            int lenCol = grid[i].length;

            for(int j = 0; j < lenCol; j++){
                if(grid[i][j] != 1) continue;

                int MAX_SIDE = 4;

                if(i != 0 && grid[i - 1][j] == 1) MAX_SIDE--;
                if(i != lenRow - 1 && grid[i + 1][j] == 1) MAX_SIDE--;
                if(j != 0 && grid[i][j - 1] == 1) MAX_SIDE--;
                if(j != lenCol - 1 && grid[i][j + 1] == 1) MAX_SIDE--;

                result += MAX_SIDE;        
            }
        }

        return result;
    }
}