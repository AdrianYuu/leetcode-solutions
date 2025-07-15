class Solution {
    public boolean isValid(String word) {
        int len = word.length();
        boolean hasVowel = false;
        boolean hasConsonant = false;

        if(len < 3) return false;
        
        for(int i = 0; i < len; i++){
            char curr = word.charAt(i);

            if(!(curr >= 'a' && curr <= 'z') &&
                !(curr >= 'A' && curr <= 'Z') &&
                !(curr >= '0' && curr <= '9')
            ){
                return false;
            }

            if("aiueo".contains(curr + "") && !hasVowel){
                hasVowel = true;
            } else if(!("aiueo".contains(curr + "")) && curr >= 'a' && curr <= 'z' && !hasConsonant){
                hasConsonant = true;
            }

            if("AIUEO".contains(curr + "") && !hasVowel){
                hasVowel = true;
            } else if(!("AIUEO".contains(curr + "")) && curr >= 'A' && curr <= 'Z' && !hasConsonant){
                hasConsonant = true;
            }
        }

        if(hasVowel && hasConsonant) return true;
        return false;
    }
}