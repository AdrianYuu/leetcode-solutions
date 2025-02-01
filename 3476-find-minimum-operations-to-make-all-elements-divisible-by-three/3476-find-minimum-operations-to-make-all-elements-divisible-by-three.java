class Solution {
    public int minimumOperations(int[] nums) {
        int result = 0;
        int len = nums.length;

        for(int i = 0; i < len; i++){
            if(nums[i] % 3 != 0) result++;
        }

        return result;
    }
}