class Solution {
    public int percentageLetter(String s, char letter) {
        int len = s.length();
        int occurence = 0;

        for(int i = 0; i < len; i++){
            if(s.charAt(i) == letter) occurence++;
        }

        double result = (double)occurence / len;

        return (int)(result * 100);
    }
}