class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       Map<Integer, Integer> hmap = new TreeMap<>();

       for(int[] num : nums1){
            if(hmap.containsKey(num[0])){
                hmap.put(num[0], hmap.get(num[0]) + num[1]);
            } else {
                hmap.put(num[0], num[1]);
            }
       }

       for(int[] num : nums2){
            if(hmap.containsKey(num[0])){
                hmap.put(num[0], hmap.get(num[0]) + num[1]);
            } else {
                hmap.put(num[0], num[1]);
            }
       }

       int[][] result = new int[hmap.size()][2];
       int index = 0;
       for(Map.Entry<Integer, Integer> entry : hmap.entrySet()){
            result[index][0] = entry.getKey();
            result[index][1] = entry.getValue();
            index++;
       }
       
       return result;
    }
}