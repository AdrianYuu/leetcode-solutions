class Solution {
    public int countCharacters(String[] words, String chars) {
        int len = words.length;
        int result = 0;
        
        for(int i = 0; i < len; i++){
            int strLen = words[i].length();
            StringBuilder sb = new StringBuilder(chars);
            boolean isValid = true;

            for(int j = 0; j < strLen; j++){
                int index = sb.toString().indexOf(words[i].charAt(j));
                if(index != -1){
                    sb.setCharAt(index, '#');
                } else {
                    isValid = false;
                    break;
                }
            }

            if(isValid) result += strLen;         
        }

        return result;
    }
}