class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ctr = new int[100];
        int len = nums.length;
        int amount = 0;
        int[] result = new int[2];        

        for(int i = 0; i < len; i++){
            ctr[nums[i]]++;
            if(ctr[nums[i]] == 2){
                result[amount] = nums[i];
                amount++;
                if(amount == 2) return result;
            }
        }

        return result;
    }
}