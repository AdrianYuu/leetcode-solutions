class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for(Character c : s.toCharArray()){
            if(c == ' ') counter++;
            if(counter == k) break;
            sb.append(c);
        }

        return sb.toString();
    }
}