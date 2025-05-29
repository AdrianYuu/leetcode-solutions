class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> mapChar = new HashMap<>();
        Map<String, Character> mapString = new HashMap<>();

        int len = pattern.length();
        String[] split = s.split(" ");

        if(len != split.length) return false;

        for(int i = 0; i < len; i++){
            Character c = pattern.charAt(i);
            String word = split[i];

            if(mapChar.containsKey(c)){
                if(!mapChar.get(c).equals(word)) return false;
            } else {
                mapChar.put(c, word);
            }

            if(mapString.containsKey(word)){
                if(mapString.get(word) != c) return false;
            } else {
                mapString.put(word, c);
            }
        }

        return true;
    }
}