class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();

        for(Character c : s.toCharArray()){
            if(hmap.containsKey(c)){
                hmap.put(c, hmap.get(c) + 1);
            } else {
                hmap.put(c, 1);
            }
        }

        int result = 0;

        for(Integer i : hmap.values()){
            if(i % 2 == 0){
                result += 2;
            } else {
                result += 1;
            }
        }

        return result;
    }
}