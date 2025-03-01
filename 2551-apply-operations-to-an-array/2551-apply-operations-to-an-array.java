class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int nonZeroLen = 0;
        int index = 0;

        for(int i = 0; i < len - 1; i++){
            if(nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        for(int i = 0; i < len; i++){
            if(nums[i] != 0){
                nonZeroLen++;
                result[index++] = nums[i];
            }
        }

        for(int i = 0; i < len - nonZeroLen; i++){
            result[index + i] = 0;
        }

        return result;
    }
}