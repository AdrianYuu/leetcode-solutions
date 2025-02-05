class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        int customerLen = accounts.length;
        int bankLen = accounts[0].length;

        for(int i = 0; i < customerLen; i++){
            int sum = 0;

            for(int j = 0; j < bankLen; j++){
                sum += accounts[i][j];
            }

            result = Math.max(result, sum);
        }

        return result;
    }
}