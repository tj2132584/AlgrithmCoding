状态模拟

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = trips.length;
        int sum = 0;
        int[] temp = new int[1001];
        for(int i = 0; i < n; i++) {
            temp[trips[i][1]] += trips[i][0];
            temp[trips[i][2]] += (-1) * trips[i][0];
        }

        for(int t : temp) {
            sum += t;

            if(sum > capacity) {
                return false;
            }
        }
        return true;
    }
}
