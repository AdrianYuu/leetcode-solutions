class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;

        int len = words.length;

        for(String w : words){
            boolean isValid = true;

            for(Character c : w.toCharArray()){
                if(!allowed.contains(String.valueOf(c))){
                    isValid = false;
                    break;
                }
            }

            if(isValid) result++;
        }

        return result;
    }
}