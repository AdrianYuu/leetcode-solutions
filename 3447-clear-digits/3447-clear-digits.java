class Solution {
    public String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();

        for(Character c : s.toCharArray()){
            if(Character.isDigit(c) && stack.length() > 0){
                stack.deleteCharAt(stack.length() - 1);
            } else{
                stack.append(c);
            }
        }

        return stack.toString();
    }
}