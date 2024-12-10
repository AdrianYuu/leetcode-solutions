class Solution {
    public int hammingWeight(int n) {
        StringBuilder s = new StringBuilder();

        while(n != 0){
            s.append(n % 2);
            n /= 2;
        }
        
        s.reverse();

        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1') sum++;
        }

        return sum;
    }
}
