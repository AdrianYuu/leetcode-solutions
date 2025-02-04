class Solution {
    public String convertDateToBinary(String date) {
        String result = "";

        String[] datePart = date.split("-");
        int len = datePart.length;

        for(int i = 0; i < len; i++){
            Integer dp = Integer.parseInt(datePart[i]);
            
            StringBuilder temp = new StringBuilder();

            while(dp != 0){
                temp.append(String.valueOf(dp % 2));
                dp /= 2;
            }

            result += temp.reverse();
            if(i != len - 1) result += "-";
        }

        return result;
    }
}