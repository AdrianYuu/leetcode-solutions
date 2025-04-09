class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> hset = new HashSet<>();

        for(int num : nums){
            if(num < k){
                return -1;
            } else if (num > k){
                hset.add(num);            
            }
        }

        return hset.size();
    }
}