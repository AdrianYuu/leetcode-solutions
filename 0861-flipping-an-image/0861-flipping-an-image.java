class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int lenRow = image.length;
        
        for(int i = 0; i < lenRow; i++){
            int lenCol = image[i].length;

            for(int j = 0; j < lenCol / 2; j++){
                int left = (image[i][j] == 0 ? 1 : 0);
                int right = (image[i][lenCol - 1 - j] == 0 ? 1 : 0);
                image[i][j] = right;
                image[i][lenCol - 1 - j] = left;                
            }

            if(lenCol % 2 == 1){
                int mid = lenCol / 2;
                image[i][mid] = (image[i][mid] == 0 ? 1 : 0);
            }
        }

        return image;
    }
}