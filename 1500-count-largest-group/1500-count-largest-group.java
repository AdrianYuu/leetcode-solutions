class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int maxSize = 0;
        int result = 0;

        for(int i = 1; i <= n; i++){
            int sum = 0;
            String s = String.valueOf(i);

            for(char c : s.toCharArray()){
                sum += (c - '0');
            }

            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
            maxSize = Math.max(maxSize, hmap.get(sum));
        }

        for(Integer val : hmap.values()){
            if(val == maxSize) result++;
        }

        return result;
    }
}