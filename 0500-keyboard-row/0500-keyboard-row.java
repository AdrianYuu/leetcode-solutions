class Solution {
    private boolean isValid(String s, String row){
        for(char c : s.toCharArray()){
            if(row.indexOf(Character.toLowerCase(c)) == -1){
                return false;
            }
        }

        return true;
    }

    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for(String s : words){
            if(isValid(s, firstRow) || isValid(s, secondRow) || isValid(s, thirdRow)){
                result.add(s);
            }
        }

        return result.toArray(new String[0]);
    }
}