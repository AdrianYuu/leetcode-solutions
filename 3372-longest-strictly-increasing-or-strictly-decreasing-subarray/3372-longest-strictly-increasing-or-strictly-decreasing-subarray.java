class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int result = 0;
        int len = nums.length;

        for(int i = 0; i < len; i++){
            int maxIdx = i;

            for(int j = i + 1; j < len; j++){
                if(nums[j] > nums[maxIdx]){
                    maxIdx = j;
                } else {
                    break;
                }
            }

            result = Math.max(result, maxIdx - i);
        }

        for(int i = 0; i < len; i++){
            int maxIdx = i;

            for(int j = i + 1; j < len; j++){
                if(nums[j] < nums[maxIdx]){
                    maxIdx = j;
                } else {
                    break;
                }
            }

            result = Math.max(result, maxIdx - i);
        }

        return result + 1;
    }
}