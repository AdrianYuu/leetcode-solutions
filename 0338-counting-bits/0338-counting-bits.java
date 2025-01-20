class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        int index = 0;
    
        for(int i = 0; i < n + 1; i++){
            String s = "";
            int counter = 0;
            int curr = i;

            while(curr != 0){
                s += String.valueOf(curr % 2);
                curr /= 2;
            }

            for(Character c : s.toCharArray()){
                if(c == '1') counter++;
            }

            result[index++] = counter;
        }

        return result;
    }
}