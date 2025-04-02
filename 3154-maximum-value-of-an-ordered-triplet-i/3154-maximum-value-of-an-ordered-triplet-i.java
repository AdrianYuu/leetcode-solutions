class Solution {
    public long maximumTripletValue(int[] nums) {
        int len = nums.length;
        long result = 0;

        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                for(int k = j + 1; k < len; k++){
                    result = Math.max(result, (long)(nums[i] - nums[j]) * nums[k]);
                }
            }
        }

        return result;
    }
}