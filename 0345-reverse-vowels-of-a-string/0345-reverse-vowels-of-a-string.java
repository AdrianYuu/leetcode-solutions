class Solution {
    public String reverseVowels(String s) {
        int len = s.length();

        int left = 0;
        int right = len - 1;

        StringBuilder sb = new StringBuilder(s);

        List<Character> vowels = new ArrayList<>(Arrays.asList('A', 'a', 'I', 'i', 'U', 'u', 'E', 'e', 'O', 'o'));

        while(left < right){
            
            while(left < right && !vowels.contains(sb.charAt(left))){
                left++;
            }

            while(left < right && !vowels.contains(sb.charAt(right))){
                right--;
            }

            if(left < right){
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;  
            }
        }

        return sb.toString();
    }
}