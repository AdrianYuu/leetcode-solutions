class Solution {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<String, Integer> map = new HashMap<>();

        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        for(int i = 0; i < s.length(); i++){
            Integer current = map.get(String.valueOf(s.charAt(i)));

            if(i == s.length() - 1){
                res += current;
                break;
            }

            Integer after = map.get(String.valueOf(s.charAt(i + 1)));
            if(current < after){
                res -= current;
            } else {
                res += current;
            }
        }

        return res;
    }
}