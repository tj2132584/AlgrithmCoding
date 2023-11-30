class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int k = n - 1;
        int j = n - 1;
        int[] res = new int[n];

        while(i <= j) {
            if(nums[i]*nums[i] >= nums[j]*nums[j]) {
                res[k] = nums[i]*nums[i];
                i++;
                //k++;
            } else {
                res[k] = nums[j]*nums[j];
                j--;
                //k++;
            }
            k--;
            if(k == -1) {
                break;
            }
        }
        return res;
    }
}
