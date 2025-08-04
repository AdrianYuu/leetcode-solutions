class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int len = prices.length;
        int buy = prices[0];

        for(int i = 1; i < len; i++){
            if(prices[i] < buy){
                buy = prices[i];
            } else {
                result = Math.max(result, prices[i] - buy);
            }
        }

        return result;
    }
}