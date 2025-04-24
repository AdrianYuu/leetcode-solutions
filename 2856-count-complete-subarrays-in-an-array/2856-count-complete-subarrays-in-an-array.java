class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> distinct = new HashSet<>();
        for(int num : nums) distinct.add(num);
        
        int distinctCount = distinct.size();
        int result = 0;
        int len = nums.length;

        for(int i = 0; i < len; i++){
            Set<Integer> temp = new HashSet<>();

            for(int j = i; j < len; j++){
                temp.add(nums[j]);
                if(temp.size() == distinctCount){
                    result += (len - j);
                    break;
                }
            }
        }

        return result;
    }
}