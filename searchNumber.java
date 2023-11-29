package leetcode;

public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int res = -1;

        while(left <= right) {
            int mid = (left +right) >> 1;

            if(nums[left] <= nums[mid]) {
                if(nums[left] <= target && nums[mid] >= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(nums[mid] <= target && nums[right] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if(nums[mid] == target) {
                res = mid;
            }
        }
        return res;
    }
}
