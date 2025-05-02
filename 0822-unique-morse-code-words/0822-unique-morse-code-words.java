class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] table = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();

        for(String s : words){
            String current = "";
            for(char c : s.toCharArray()) current += ("" + table[c - 'a']);
            set.add(current);
        }

        return set.size();
    }
}