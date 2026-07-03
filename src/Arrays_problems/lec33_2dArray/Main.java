package Arrays_problems.lec33_2dArray;

import java.util.ArrayList;
import java.util.Arrays;
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

    static int[][] transposeMatrix(int[][] arr) {
        if (arr == null || arr.length == 0){
            return new int[0][0];
        }
        // old array
        int rowLen = arr.length;
        int colLen = arr[0].length;
        // new array
        int newRowLen = colLen;
        int newColLen = rowLen;
        int ans[][] = new int[newRowLen][newColLen];

        for (int i = 0; i < rowLen ; i++) {
            for (int j = 0; j < colLen; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;


    }

    static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}};
//        System.out.println(rowSums(arr));
//        System.out.println(colSum(nums));
//        System.out.println(wavePrint(arr));
        System.out.println(Arrays.deepToString(transposeMatrix(arr)));
    }
}
