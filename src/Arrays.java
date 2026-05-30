import java.util.Scanner;

public class Arrays {
    static void main() {
        int[] arr = new int[5];
        //taking inp
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
            System.out.println("take inp for each index");
        for (int i = 0; i <= n-1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int val: arr){
            System.out.println(val);
        }

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
