class Solution {
    public int subarraySum(int[] nums) {
        int result = 0;
        int len = nums.length;

        for(int i = 0; i < len; i++){
            int sum = 0;
            for(int j = Math.max(0, i - nums[i]); j <= i; j++){
                sum += nums[j];
            }
            result += sum;
        }

        return result;
    }
}