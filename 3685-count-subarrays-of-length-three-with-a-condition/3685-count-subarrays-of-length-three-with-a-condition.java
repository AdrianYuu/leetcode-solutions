class Solution {
    public int countSubarrays(int[] nums) {
        int len = nums.length;
        int result = 0;

        for(int i = 1; i < len - 1; i++){
            if(nums[i] == (nums[i - 1] + nums[i + 1]) * 2) result++;
        }

        return result;
    }
}