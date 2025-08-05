class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int len = fruits.length;
        int result = len;

        for(int i = 0; i < len; i++){

            for(int j = 0; j < len; j++){
                if(baskets[j] >= fruits[i]){
                    baskets[j] = -1;
                    result--;
                    break;
                }
            }
        }

        return result;
    }
}