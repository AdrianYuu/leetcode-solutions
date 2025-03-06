class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length;
        int missing = -1, repeat = -1;

        Map<Integer, Integer> hmap = new HashMap<>();
        for (int[] r : grid){
            for (int num : r){
                hmap.put(num, hmap.getOrDefault(num, 0) + 1);
            }
        }

        for(int i = 1; i <= len * len; i++){
            if (!hmap.containsKey(i)){
                missing = i;
            } else if (hmap.get(i) == 2){
                repeat = i;
            }
        }

        return new int[] {repeat, missing};
    }
}