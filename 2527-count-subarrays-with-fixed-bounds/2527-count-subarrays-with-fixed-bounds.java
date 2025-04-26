class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long result = 0;
        int len = nums.length;
        int start = -1, max = -1, min = -1;

        for(int i = 0; i < len; i++){
            if(nums[i] < minK || nums[i] > maxK) start = i;
            if(nums[i] == maxK) max = i;
            if(nums[i] == minK) min = i;
            result += Math.max(0, Math.min(min, max) - start);
        }

        return result;
    }
}