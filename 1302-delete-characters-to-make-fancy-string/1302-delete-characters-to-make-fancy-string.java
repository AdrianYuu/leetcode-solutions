class Solution {
    public String makeFancyString(String s) {
        int len = s.length();
        int consecutive = 1;
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < len; i++){
            if(i > 0 && s.charAt(i) == s.charAt(i - 1))
                consecutive++;
            else
                consecutive = 1;

            if(consecutive <= 2)
                result.append(s.charAt(i));
        }

        return result.toString();
    }
}