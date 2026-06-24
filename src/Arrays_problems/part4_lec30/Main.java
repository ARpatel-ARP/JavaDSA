package Arrays_problems.part4_lec30;

import java.util.Arrays;

public class Main {

    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i <=n-2 ; i++) {
            for (int j = i+1; j <=n-1 ; j++) {
                if (nums[i]+nums[j] == target){
                    int ans[] = {i, j};
                    return ans;
                }
            }
        }
        int[] ans = {};
        return  ans;
    }
    static void main(String[] args) {
        int[] nums = {-6, 81, -15, -96, 77, 92, 12, 3};
        System.out.println(Arrays.toString(twoSum(nums, 15)));
    }
}
