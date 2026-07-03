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

    static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(rowSums(arr));
    }
}
