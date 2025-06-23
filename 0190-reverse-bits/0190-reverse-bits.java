public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String bits = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        String reversedBits = new StringBuilder(bits).reverse().toString();
        return (int)Long.parseLong(reversedBits, 2);
    }
}