class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) return false;

        HashMap<Character, Integer> hmap = new HashMap<>();

        for(Character c : s.toCharArray()){
            if(hmap.containsKey(c)){
                hmap.put(c, hmap.get(c) + 1);
                continue;
            }

            hmap.put(c, 1);
        }

        int result = 0;

        for(Integer f : hmap.values()){
            if(f % 2 != 0) result++; 
        }

        return result <= k;
    }
}