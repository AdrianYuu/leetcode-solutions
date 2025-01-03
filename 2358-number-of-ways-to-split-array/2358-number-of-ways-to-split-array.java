class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        int result = 0;

        for(int n : nums){
            sum += n;
        }

        int size = nums.length - 1;

        long leftSum = 0;

        for(int i = 0; i < size; i++){
            leftSum += nums[i];

            if(leftSum >= (sum - leftSum)){
                result++;
            }
        }

        return result;
    }
}
