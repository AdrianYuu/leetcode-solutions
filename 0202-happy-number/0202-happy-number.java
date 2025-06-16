class Solution {
    public boolean isHappy(int n) {
        Map<Integer, Boolean> map = new HashMap<>();
        int current = n;

        while(true){
            int sum = 0;

            while(current != 0){
                sum += Math.pow((current % 10), 2);
                current /= 10;
            }

            current = sum;

            if(map.containsKey(sum)) return false;
            
            if(sum == 1) return true;
            map.put(sum, true);
        }
    }
}