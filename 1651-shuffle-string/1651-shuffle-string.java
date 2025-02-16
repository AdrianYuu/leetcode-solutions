class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        int len = indices.length;

        for(int i = 0; i < len; i++){
            sb.setCharAt(indices[i], s.charAt(i));
        }

        return sb.toString();
    }
}