package Arrays_problems.part4_lec30;

import java.util.*;

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

    static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n=nums.length;
        int target = 0;
        for (int i = 0; i <=n-2 ; i++) {
            for (int j = i+1; j <=n-1 ; j++) {
                for (int k = j+1; k <n ; k++) {
                    if (nums[i] + nums[j] + nums[k] == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        result.add(temp);
                    }
                }
            }
        }return new ArrayList<>(result);
    }
    static void main(String[] args) {
        int[] nums = {-6, 81, -15, -96, 77, 92, 12, 3};
        System.out.println(Arrays.toString(twoSum(nums, 15)));
    }
}
