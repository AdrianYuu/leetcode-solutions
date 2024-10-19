class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int carry = 0;

        while (lenA >= 0 || lenB >= 0 || carry > 0) {
            int sum = carry;

            if (lenA >= 0) {
                sum += a.charAt(lenA--) - '0';
            }

            if (lenB >= 0) {
                sum += b.charAt(lenB--) - '0';
            }

            res.append(sum % 2);
            carry = sum / 2;
        }

        return res.reverse().toString();
    }
}