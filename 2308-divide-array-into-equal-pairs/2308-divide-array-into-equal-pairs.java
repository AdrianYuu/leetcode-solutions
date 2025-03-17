class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        
        for(int num : nums){
            if(hmap.containsKey(num)){
                hmap.put(num, hmap.get(num) + 1);
            } else {
                hmap.put(num, 1);
            }
        }

        for(int v : hmap.values()){
            if(v % 2 != 0) return false;
        }

        return true;
    }
}