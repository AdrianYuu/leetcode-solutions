class Solution {
    private int convertBinaryToNumber(String binary){
        int result = 0;
        int len = binary.length();
        StringBuilder sb = new StringBuilder(binary);
        binary = sb.reverse().toString();

        for(int i = 0; i < len; i++){
            if(binary.charAt(i) == '1'){
                result += Math.pow(2, i);
            }
        }

        return result;
    }

    private String convertNumberToBinary(int number){
        if(number == 0) return "0";

        StringBuilder sb = new StringBuilder();
        while(number > 0){
            sb.append(number % 2);
            number /= 2;
        }

        return sb.reverse().toString();
    }

    public String findDifferentBinaryString(String[] nums) {
        List<Integer> numbers = new ArrayList<>();

        for(String num : nums){
            numbers.add(convertBinaryToNumber(num));
        }

        Collections.sort(numbers);

        int index = -1;

        int len = numbers.size();
        for(int i = 0; i < len; i++){
            if(numbers.get(i) != i){
                index = i;
                break;
            }
        }

        if (index == -1){
            index = len;
        }

        String result = convertNumberToBinary(index);
        while(result.length() < nums[0].length()){
            result = "0" + result;
        }

        return result;
    }
}