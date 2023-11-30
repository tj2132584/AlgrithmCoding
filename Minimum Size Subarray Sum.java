class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        int L = n + 1;

        for(i = 0; i < n; i++) {
            if(sum < target) {
                sum += nums[i];
            }
            while(sum >= target) {
                L = Math.min(i - j + 1, L);
                sum -= nums[j];
                j++;
            }  
        }
        return L == n + 1 ? 0 : L;
    }
    
}
