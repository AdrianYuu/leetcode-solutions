class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        int index = 1;

        for(char c : s.toCharArray()){
            int temp = ('a' - c + 26) * index++;
            result += temp;
        }

        return result;
    }
}