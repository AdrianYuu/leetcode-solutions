class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> hmap = new HashMap<>();

        int len = arr.length;

        for(int i = 0; i < len; i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            } else {
                hmap.put(arr[i], 1);
            }
        }

        int result = -1;
        for(Map.Entry<Integer, Integer> entry : hmap.entrySet()){
            if(entry.getKey() == entry.getValue()){
                result = Math.max(result, entry.getKey());
            }
        }

        return result;
    }
}