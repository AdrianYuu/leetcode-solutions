class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int result = 0;

        String[] splittedText = text.split(" ");

        int len = brokenLetters.length();
        String[] brokenLetterArr = new String[len];
        for(int i = 0; i < len; i++) brokenLetterArr[i] = String.valueOf(brokenLetters.charAt(i));

        for(String s : splittedText){
            boolean isValid = true;

            for(String letter : brokenLetterArr){
                if(s.contains(letter)){
                    isValid = false;
                    break;
                }
            }

            if(isValid) result++;
        }

        return result;
    }
}