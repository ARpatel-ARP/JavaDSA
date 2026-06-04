package javabasics;
import java.util.Scanner;

public class Arrays_1D {
    static void main() {
        int[] arr = new int[5];
        int n = arr.length;
        Scanner sc = new Scanner(System.in);

        // find MAX value :
        int maxValue = arr[0];
        for (int i = 0; i <=n-1 ; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);

        // Mul the inp of array
//        int mul = 1;
//        System.out.println("Enter 3 nums to mul");
//        for (int i = 0; i <=n-3 ; i++) {
//            arr[i] = sc.nextInt();
//            mul = mul*arr[i];
//        }
//        System.out.println(mul);

        // sum the input of array
//        int sum = 0;
//        System.out.println("Enter nums to add");
//        for (int i = 0; i <=n-1 ; i++) {
//            arr[i] = sc.nextInt();
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);

        //taking inp
//        Scanner sc = new Scanner(System.in);
//            System.out.println("take inp for each index");
//        for (int i = 0; i <= n-1; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int val: arr){
//            System.out.println(val);
//        }

        //initialize
//        int[] brr = {10,2,3};
        // access
//        int n = brr.length;
        // method - 1
//        for (int i=0; i<=n-1; i++){
//            System.out.println(brr[i]);
//        }
        // method 2 : for each loop
//        for (int val: brr){
//            System.out.println(val);
//        }

    }
}
