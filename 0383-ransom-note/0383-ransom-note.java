class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ctr = new HashMap<>();

        for(char c : magazine.toCharArray()){
            if(ctr.containsKey(c)) ctr.put(c, ctr.get(c) + 1);
            else ctr.put(c, 1);
        }

        for(char c : ransomNote.toCharArray()){
            if(!ctr.containsKey(c) || ctr.get(c) <= 0) return false;
            ctr.put(c, ctr.get(c) - 1);
        }

        return true;
    }
}