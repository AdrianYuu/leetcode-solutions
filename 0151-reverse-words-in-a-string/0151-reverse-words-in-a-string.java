class Solution {
    public String reverseWords(String s) {
        String[] splitted = s.trim().split(" ");

        int len = splitted.length;

        String result = "";

        for(int i = len - 1; i >= 0; i--){
            String trimmed = splitted[i].trim();

            if(trimmed.isBlank()) continue;

            if(i != 0) result += (trimmed + " ");
            else result += trimmed;
        }

        return result;
    }
}