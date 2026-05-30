import java.util.Scanner;

public class Arrays {
    static void main() {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        // Mul the inp of array
        int mul = 1;
        int n = arr.length;
        System.out.println("Enter 3 nums to mul");
        for (int i = 0; i <=n-3 ; i++) {
            arr[i] = sc.nextInt();
            mul = mul*arr[i];
        }
        System.out.println(mul);

        // sum the input of array
//        int n = arr.length;
//        int sum = 0;
//        System.out.println("Enter nums to add");
//        for (int i = 0; i <=n-1 ; i++) {
//            arr[i] = sc.nextInt();
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);

        //taking inp
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
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
