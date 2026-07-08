package Arrays_problems.lec31;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> findDisappearedElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n ; i++) {
            int value = Math.abs(nums[i]);
            int position = value - 1; // ideal position
            if (nums[position] > 0){ // if number at ideal position is +ve
                nums[position] = -nums[position];
            } // marked
        }
        for (int i = 0; i < n; i++) {
            if (nums[i]>0){ // if value +ve
                ans.add(i+1);
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] nums = {1,4,4,5,2,2};
        System.out.println(findDisappearedElement(nums));
    }
}
