class Solution {
    public long countSubarrays(int[] nums, int k) {
        long result = 0;
        int len = nums.length;

        int[] temp = nums.clone();
        Arrays.sort(temp);
        long maxElement = temp[len - 1];

        int left = 0, maxElementCtr = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] == maxElement) maxElementCtr++;

            while(maxElementCtr >= k){
                result += len - i;
                if(nums[left] == maxElement) maxElementCtr--;
                left++;
            }
        }

        return result;
    }
}