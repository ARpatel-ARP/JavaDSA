package Arrays_problems.lec34;

import java.util.Arrays;

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

    static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.deepToString(rotateArrayBy90deg(arr)));
    }
}
