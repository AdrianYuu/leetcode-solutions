class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int len = s1.length();
        int index = 0;
        char[] t1 = new char[3];
        char[] t2 = new char[3];

        for(int i = 0; i < len; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                t1[index] = s1.charAt(i);
                t2[index] = s2.charAt(i);
                index++;
                if(index == 3) return false;
            }
        }

        if(t1[0] == t2[1] && t1[1] == t2[0]) return true;
        return false;
    }
}