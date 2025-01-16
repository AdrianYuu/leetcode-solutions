class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = 2 * n;
        int[] result = new int[len];
        int index = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        for(int i = 0; i < len; i++){
            if(i % 2 == 0){
                result[index++] = nums[leftIndex++];
                continue;
            }
            
            result[index++] = nums[n + rightIndex++];
        }

        return result;
    }
}