package leetcode;
import java.util.*;
public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        //排序数组
        Arrays.sort(nums);

        //初始化结果集合以及数组长度
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < n - 2; i++) {
            int x = nums[i];

            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if(x + nums[i + 1] + nums[i + 2] > 0) {
                break;
            }
            if(x + nums[n - 1] + nums[n - 2] < 0) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while(j < k) {
                int sum = x + nums[j] + nums[k];

                if(sum > 0){
                    k--;
                } else if(sum < 0) {
                    j++;
                } else if(sum == 0) {
                    res.add(List.of(x, nums[j], nums[k]));
                    for(j += 1; j < k && nums[j] == nums[j - 1]; j++) {
                        continue;
                    }
                    for(k -= 1; j < k && nums[k] == nums[k + 1]; k--) {
                        continue;
                    }
                }
            }
        }
        return res;
    }
}
