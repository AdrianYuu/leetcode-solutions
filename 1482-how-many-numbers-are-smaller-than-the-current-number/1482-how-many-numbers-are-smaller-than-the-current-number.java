class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        
        Map<Integer, Integer> hmap = new HashMap<>();

        for(int num : nums) hmap.put(num, hmap.getOrDefault(num, 0) + 1);

        List<Integer> sortedKeys = new ArrayList<>(hmap.keySet());
        Collections.sort(sortedKeys);

        Map<Integer, Integer> smallerCount = new HashMap<>();
        int count = 0;

        for(int key : sortedKeys){
            smallerCount.put(key, count);
            count += hmap.get(key);
        }

        for(int i = 0; i < len; i++){
            result[i] = smallerCount.get(nums[i]);
        }

        return result;
    }
}