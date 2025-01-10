class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();

        int[] maxFreq = new int[26];

        for(String word2 : words2){
            int[] freq = new int[26];

            for(Character c : word2.toCharArray()){
                freq[c - 'a']++;
                maxFreq[c - 'a'] = Math.max(maxFreq[c - 'a'], freq[c - 'a']);
            }
        }

        for(String word1 : words1){
            int[] freq = new int[26];

            for(Character c : word1.toCharArray()) {
                freq[c - 'a']++;
            }

            boolean isValid = true;
            
            for(int i = 0; i < 26; i++){
                if(freq[i] < maxFreq[i]){
                    isValid = false;
                    break;
                }
            }

            if(isValid) result.add(word1);
        }
        return result;
    }
}