class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> hmap1 = new HashMap<>();
        Map<Integer, Integer> hmap2 = new HashMap<>();
        int len = nums.size();

        for(int num : nums) hmap2.put(num, hmap2.getOrDefault(num, 0) + 1);

        for(int i = 0; i < len; i++){
            int num = nums.get(i);

            hmap2.put(num, hmap2.get(num) - 1);
            hmap1.put(num, hmap1.getOrDefault(num, 0) + 1);

            if(hmap1.get(num) * 2 > i + 1 && hmap2.get(num) * 2 > len - i - 1){
                return i;
            }
        }

        return -1;
    }
}