class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int leftSum = 0;
        int rightSum = 0;

        int[] result = new int[len];
        int[] leftArr = new int[len];
        int[] rightArr = new int[len];

        for(int i = 0; i < len; i++){
            leftArr[i] = leftSum;
            rightArr[len - 1 - i] = rightSum;
            leftSum += nums[i];
            rightSum += nums[len - 1 - i];
        }

        for(int i = 0; i < len; i++){
            result[i] = Math.abs(leftArr[i] - rightArr[i]);
        }

        return result;
    }
}