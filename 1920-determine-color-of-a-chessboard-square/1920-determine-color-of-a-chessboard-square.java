class Solution {
    public boolean squareIsWhite(String coordinates) {
        Character letter = coordinates.charAt(0);
        String strNumber = String.valueOf(coordinates.charAt(1));
        Integer number = Integer.parseInt(strNumber);

        if((letter - 'a') % 2 == 0){
            if(number % 2 == 1) return false;
            return true;
        } else {
            if(number % 2 == 1) return true;
            return false;
        }
    }
}