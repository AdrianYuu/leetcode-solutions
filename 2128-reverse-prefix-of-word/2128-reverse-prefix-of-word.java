class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(String.valueOf(ch))) return word;

        StringBuilder sb = new StringBuilder(word);

        int index = word.indexOf(ch);

        for(int i = index, j = 0; i > (index / 2); i--, j++){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
        }

        return sb.toString();
    }
}