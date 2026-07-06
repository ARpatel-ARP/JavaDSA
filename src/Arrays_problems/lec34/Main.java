package Arrays_problems.lec34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int[][] rotateArrayBy90deg(int[][] arr) {
      int N = arr.length;
      int M = arr[0].length;
      // transpose
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < M; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // reverse the rows
        for (int i = 0; i < N; i++) {
            int stCol = 0;
            int endCol = M-1;
            while (stCol<=endCol){
                int temp = arr[i][stCol];
                arr[i][stCol] = arr[i][endCol];
                arr[i][endCol] = temp;

                stCol++;
                endCol--;
            }
        }
        return arr;



    }

    static List<Integer> spiralPrint(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        int N = arr.length;
        int M = arr[0].length;
        // 4 - pointers :
        int stRow = 0;
        int endRow = N-1;
        int stCol = 0;
        int endCol = M-1;
        // 4 - for_loops
        while(stRow<=endRow && stCol<=endCol){
            // row wise Left to right
            for (int i = stCol; i <=endCol ; i++) {
                result.add(arr[stRow][i]);
            }
                stRow++;
            // col wise top to bottom
            for (int i = stRow; i <= endRow; i++) {
                result.add(arr[i][endCol]);
            }
                endCol--;
            // row wise right to left
            for (int i = endCol; i >= stCol ; i--) {
                result.add(arr[endRow][i]);
            }
                endRow--;
            // col wise bottom to top
            for (int i = endRow; i >=stRow ; i--) {
                result.add(arr[i][stCol]);
            }
                stCol++;

        }
        return result;

    }

    static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
//        System.out.println(Arrays.deepToString(rotateArrayBy90deg(arr)));
        System.out.println(spiralPrint(arr));
    }

}
