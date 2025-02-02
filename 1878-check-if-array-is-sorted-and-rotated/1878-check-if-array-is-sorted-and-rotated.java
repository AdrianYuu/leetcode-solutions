class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;

        for(int i = 0; i < len; i++){
            int[] tempArr = new int[len];
            int index = 0;

            for(int j = i; j < len; j++){
                tempArr[index++] = nums[j];
            }

            for(int j = 0; j < i; j++){
                tempArr[index++] = nums[j];
            }

            boolean isValid = true;
            for(int j = 0; j < len - 1; j++){
                if(tempArr[j] > tempArr[j + 1]){
                    isValid = false;
                    break;
                }
            }

            if(isValid) return true;
        }
        
        return false;
    }
}