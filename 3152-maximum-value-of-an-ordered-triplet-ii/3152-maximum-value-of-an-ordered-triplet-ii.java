class Solution {
    public long maximumTripletValue(int[] nums) {
        int len = nums.length;
        long result = 0;

        int maxI = nums[0];
        long bestDiff = 0;

        for(int j = 0; j < len - 1; j++){
            bestDiff = Math.max(bestDiff, (long)maxI - nums[j]);

            result = Math.max(result, bestDiff * nums[j + 1]);

            maxI = Math.max(maxI, nums[j]);
        }

        return result;
    }
}