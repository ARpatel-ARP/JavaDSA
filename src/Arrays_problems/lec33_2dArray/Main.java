package Arrays_problems.lec33_2dArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> rowSums(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m ; i++) { // rows
            int sum = 0;
            for (int j = 0; j < n ; j++) { //cols
                int value = arr[i][j];
                sum = sum + value;
            }
            result.add(sum);
        }
        return result;

    }

    static List<Integer> colSum(int[][] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums[0].length;
        int m = nums.length;

        for (int i = 0; i < n ; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                int val = nums[j][i];
                sum = sum + val;
            }
            result.add(sum);
        }
        return result;
    }

    static List<Integer> wavePrint(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        int n = arr[0].length;
        int m = arr.length;

        for (int i = 0; i < n; i++) {
            if (i%2==0){
                for (int j = 0; j <m ; j++) {
                    res.add(arr[j][i]);
                }
            }else{
                for (int j = m-1; j >=0 ; j--) {
                    res.add(arr[j][i]);
                }
            }

        }
        return res;
    }

    static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}};
//        System.out.println(rowSums(arr));
//        System.out.println(colSum(nums));
        System.out.println(wavePrint(arr));
    }
}
