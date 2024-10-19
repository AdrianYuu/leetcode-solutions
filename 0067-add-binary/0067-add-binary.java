class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();

        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        boolean isExtra = false;
        int current = 0;

        while((lenA >= 0) && (lenB >= 0)){
            if(isExtra){
                current = (a.charAt(lenA) - '0') + (b.charAt(lenB) - '0') + 1;
                isExtra = false;
            } else {
            	current = (a.charAt(lenA) - '0') + (b.charAt(lenB) - '0');
            }
            
            if(current >= 2){
                isExtra = true;
                if(current == 2) {
                	res.append(0);
                } else {
                	res.append(1);
                }
            } else {
                res.append(current);
            }

            if(isExtra && lenA == 0 && lenB == 0) res.append("1");

            lenA--;
            lenB--;
        }
        
        while(lenA >= 0){
            if(isExtra){
                current = (a.charAt(lenA) - '0') + 1;
                isExtra = false;
            } else {
                current = (a.charAt(lenA) - '0');
            }

            if(current >= 2){
                isExtra = true;
                if(current == 2) {
                	res.append(0);
                } else {
                	res.append(1);
                }
                if(lenA == 0) res.append("1");
            } else {
                res.append(current);
            }

            lenA--;
        }

        while(lenB >= 0){
            if(isExtra){
                current = (b.charAt(lenB) - '0') + 1;
                isExtra = false;
            } else {
                current = (b.charAt(lenB) - '0');
            }

            if(current >= 2){
            	isExtra = true;
                if(current == 2) {
                	res.append(0);
                } else {
                	res.append(1);
                }
                if(lenB == 0) res.append("1");
            } else {
                res.append(current);
            }

            lenB--;
        }
        
        return res.reverse().toString();
    }
}