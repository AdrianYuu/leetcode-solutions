class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int result = 0;

        int len = words.length;

        for(int i = 0; i < len; i++){

            for(int j = i + 1; j < len; j++){
                int index = words[j].indexOf(words[i]);
                int lastIndex = words[j].indexOf(words[i], words[j].length() - words[i].length());

                if(lastIndex == -1 || index != 0) continue;

                result++;
            }
        }

        return result;
    }
}