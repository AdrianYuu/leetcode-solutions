class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> letters = new HashSet<>();

        for(Character c : s.toCharArray()){
            letters.add(c);
        }

        int len = s.length();

        int result = 0;
        
        for(Character letter : letters){
            int firstIndex = -1;
            int lastIndex = -1;

            for(int i = 0; i < len; i++){
                if(s.charAt(i) != letter) continue;

                if(firstIndex == -1){
                    firstIndex = i;
                } else {
                    lastIndex = i;
                }
            }

            if(firstIndex == -1 || lastIndex == -1) continue;

            Set<Character> lettersRange = new HashSet<>();
            for(int i = firstIndex + 1; i < lastIndex; i++){
                lettersRange.add(s.charAt(i));
            }

            result += lettersRange.size();
        }

        return result;
    }
}