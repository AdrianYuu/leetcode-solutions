class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for(Character c : moves.toCharArray()){
            if(c == 'R') x++;
            else if(c == 'L') x--;
            else if(c == 'U') y--;
            else if(c == 'D') y++;
        }

        if(x == 0 && y == 0) return true;
        return false;
    }
}