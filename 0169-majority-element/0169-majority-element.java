class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int n = nums.length;

        for(int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);

            if(hashMap.get(num) > n / 2){
                return num;
            }
        }

        return -1;
    }
}