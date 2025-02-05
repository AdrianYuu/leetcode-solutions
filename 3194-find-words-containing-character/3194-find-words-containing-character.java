class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        int len = words.length;

        for(int i = 0; i < len; i++){
            if(words[i].contains(String.valueOf(x))) result.add(i);
        }

        return result;
    }
}