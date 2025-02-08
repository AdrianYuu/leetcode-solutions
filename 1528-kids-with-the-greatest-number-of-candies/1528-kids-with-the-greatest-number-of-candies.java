class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        Integer maxVal = Integer.MIN_VALUE;

        int len = candies.length;

        for(int i = 0; i < len; i++){
            maxVal = Math.max(candies[i], maxVal);
            candies[i] += extraCandies;
        }
        
        for(int i = 0; i < len; i++){
            if(candies[i] < maxVal){
                result.add(false);
                continue;
            }

            result.add(true);
        }

        return result;
    }
}