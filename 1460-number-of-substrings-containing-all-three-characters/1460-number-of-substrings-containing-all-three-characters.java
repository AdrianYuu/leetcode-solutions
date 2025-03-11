class Solution {
    public int numberOfSubstrings(String s) {
        int len = s.length();
        int left = 0;
        int right = 0;
        int[] freq = new int[3];

        int result = 0;

        while(right < len){
            char currentChar = s.charAt(right);
            freq[currentChar - 'a']++;

            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                result += (len - right);

                freq[s.charAt(left) - 'a']--;
                left++;
            }

            right++;
        }

        return result;
    }
}