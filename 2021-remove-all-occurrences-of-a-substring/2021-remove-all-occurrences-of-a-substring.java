class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int length = part.length();

        while(sb.indexOf(part) != -1){
            sb.delete(sb.indexOf(part), sb.indexOf(part) + length);
        }

        return sb.toString();
    }
}
