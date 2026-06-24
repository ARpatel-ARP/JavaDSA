package Arrays_problems.part4_lec30;

import java.util.*;
import java.util.stream.Collectors;

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
                        temp.add(i);
                        temp.add(j);
                        temp.add(k);
                        Collections.sort(temp);
                        result.add(temp);
                    }
                }
            }
        }return new ArrayList<>(result);
    }
    // More Optimized way :
    static List<List<Integer>> threeSumOpt(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    static int removeDupls(int[] nums) {
        Arrays.sort(nums);
    int n = nums.length;
    int i = 0;
    int j = 1;
       while (j<n){
           if (nums[i] == nums[j]){
               j++;
           }
           else {
               i++;
               nums[i] = nums[j];
               j++;
           }
       }
        return i+1;
    }

    static void main(String[] args) {
        int[] nums = {2,1,2,2,2,3,4,5,5,4};
//        System.out.println(Arrays.toString(twoSum(nums, 15)));
//        System.out.println(threeSum(nums));
        System.out.println(removeDupls(nums));
    }
}
