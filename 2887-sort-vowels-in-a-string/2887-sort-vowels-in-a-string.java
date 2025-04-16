class Solution {
    public String sortVowels(String s) {
        Set<Character> vowelSet = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Character> vowels = new ArrayList<>();

        for(char c : s.toCharArray()) if(vowelSet.contains(c)) vowels.add(c);

        Collections.sort(vowels);

        StringBuilder result = new StringBuilder(s);
        int len = s.length();
        int index = 0;

        for(int i = 0; i < len; i++){
            if(vowelSet.contains(s.charAt(i))){
                result.setCharAt(i, vowels.get(index++));
            }
        }

        return result.toString();
    }
}
