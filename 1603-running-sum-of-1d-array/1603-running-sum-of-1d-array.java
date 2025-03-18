class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int index = 0;

        result[0] = nums[0];

        for(int i = 1; i < len; i++){
            result[i] += result[i - 1] + nums[i];
        }

        return result;
    }
}