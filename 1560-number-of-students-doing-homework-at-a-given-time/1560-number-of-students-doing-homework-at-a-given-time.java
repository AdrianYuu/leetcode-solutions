class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;

        int len = startTime.length;

        for(int i = 0; i < len; i++){
            if(queryTime >= startTime[i] && queryTime <= endTime[i]) result++;
        }

        return result;
    }
}