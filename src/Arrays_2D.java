package javabasics;

import java.util.Scanner;

public class Arrays_2D {
    static void main() {
        // declaration
//        int [][] arr ;
        // alloc
//        arr = new int[3][4];
        //init
        int [][] brr = {
                {4,5},
                {6,7,4,5,6,4,5},
                {8,9}
        };
        // print all values:
//        int rowLen = brr.length;
////        int colLen = brr[0].length; // only applicable if all rows have same no. of col vals
//
//        for (int i=0; i<=rowLen-1; i++){
//            // to find the colLen for each row
//            int colLen = brr[i].length;
//            for (int j=0; j<=colLen-1; j++){
//                System.out.print(brr[i][j] + " ");
//            }
//            System.out.println();
//        }
        // Generalised version for traversal :
        int rowLen = brr.length;
//        for (int rowIndex=0; rowIndex<=rowLen-1; rowIndex++){
//            for (int colIndex=0; colIndex<=brr[rowIndex].length-1; colIndex++){
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }

        // input
        int [][] arr = new int[2][3];
        Scanner sc = new Scanner(System.in);

//        for (int i=0; i<=arr.length-1; i++){
//            for (int j=0; j<=arr[i].length-1; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int rowIndex=0; rowIndex<=arr.length-1; rowIndex++){
//            for (int colIndex=0; colIndex<=arr[rowIndex].length-1; colIndex++){
//                System.out.print(arr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }
        // for sum of inputs
//        int sum = 0;
//         for (int i=0; i<=arr.length-1; i++){
//             for (int j=0; j<=arr[i].length-1; j++){
//                 arr[i][j] = sc.nextInt();
//                 int value = arr[i][j];
//                 sum = sum + value;
//
//             }
//         }
//        System.out.println(sum);

         // for multiplying
//        int mul = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//                int value = arr[i][j];
//                mul = mul*value;
//            }
//        }
//        System.out.println(mul);

        // for finding maxValue
        int maxValue = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j]>maxValue){
                    maxValue = arr[i][j];
                }

            }
        }
        System.out.println(maxValue);



    }
}
