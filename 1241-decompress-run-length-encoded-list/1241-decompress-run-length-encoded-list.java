class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int len = nums.length;
        int index = 0;

        for(int i = 0; i < len; i += 2){
            for(int j = 0; j < nums[i]; j++){
                result.add(nums[i + 1]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}