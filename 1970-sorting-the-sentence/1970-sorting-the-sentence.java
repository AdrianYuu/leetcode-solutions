class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> hmap = new HashMap<>();

        String[] words = s.split(" ");

        for(String word : words){
            hmap.put((int) word.charAt(word.length() - 1) - '0', word.substring(0, word.length() - 1));
        }

        String result = "";
        for(String value : hmap.values()){
            result = result + value + " ";
        }

        return result.trim();
    }
}