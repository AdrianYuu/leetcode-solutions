class Solution {
    public List<String> cellsInRange(String s) {
        String[] parts = s.split(":");

        char firstChar = parts[0].charAt(0);
        int firstNum = parts[0].charAt(1) - '0';

        char secondChar = parts[1].charAt(0);
        int secondNum = parts[1].charAt(1) - '0';

        List<String> result = new ArrayList<>();

        for(char i = firstChar; i <= secondChar; i++){
            for(int j = firstNum; j <= secondNum; j++){
                result.add("" + i + j);
            }
        }

        return result;
    }
}