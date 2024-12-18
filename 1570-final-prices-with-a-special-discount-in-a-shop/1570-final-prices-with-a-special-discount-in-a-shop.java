class Solution {
    public int[] finalPrices(int[] prices) {
        int length = prices.length;
        if(length == 1) return prices;

        int[] result = new int[length];

        for(int i = 0; i < length; i++){

            boolean isExists = false;

            for(int j = i + 1; j < length; j++){
                if(prices[j] <= prices[i]){
                    result[i] = prices[i] - prices[j];
                    isExists = true;
                    break;
                }
            }

            if(!isExists){
                result[i] = prices[i];
            }
        }

        return result;
    }
}