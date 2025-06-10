class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int odd = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;

        for(Character c : map.keySet()){
            Integer current = map.get(c);
            if(current % 2 == 1) odd = Math.max(odd, current);
            else even = Math.min(even, current);
        }

        return odd - even;
    }
}