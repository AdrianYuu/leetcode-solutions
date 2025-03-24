class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        int result = 0; 
        int prev = 0;

        for(int[] meeting : meetings){
            int start = meeting[0];
            int end = meeting[1];

            if(start > prev){
                result += (end - start + 1);
            } else if(end > prev) {
                result += (end - prev);
            }

            prev = Math.max(prev, end);
        }

        return days - result;
    }
}