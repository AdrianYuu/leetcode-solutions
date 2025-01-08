class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int len = nums.length;
        boolean[] seen = new boolean[len + 5];
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < len; i++) seen[nums[i]] = true;
        
        for(int i = 1; i <= len; i++){
            if(seen[i] == false){
                result.add(i);
            }
        }

        return result;
    }
}