class Solution {
    public int maxAscendingSum(int[] nums) {
        int len = nums.length;
        int result = 0;
        int temp = 0;

        for(int i = 0; i < len; i++){
            temp += nums[i];
            if(i != len - 1 && nums[i] >= nums[i + 1]){
                result = Math.max(result, temp);
                temp = 0;
            }
        }

        result = Math.max(result, temp);

        return result;
    }
}