class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        double result = Double.MAX_VALUE;

        for(int i = 0; i < len / 2; i++){
            result = Math.min(result, (double)(nums[i] + nums[len - 1 - i]) / 2);
        }

        return result;
    }
}