import java.util.Scanner;

public class Bitwise_lec_26 {
    static void main() {
//        int a = 5;
//        int b= 6;
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a^b);
//        System.out.println(~a);

        // Bitwise left shift <<
//        int n= 1;
//        for (int i =1; i<=32; i++){
//           n = n << 1;
//            System.out.println(n);
//        }
        // Bitwise right shift
//        int n= 100;
//        for ( int i =1; i<=10; i++){
//            n = n >> 1;
//            System.out.println(n);
//        }

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if ((n&1) == 1){
            System.out.println(n + " IS ODD");
        }else if ((n&1) == 0){
            System.out.println(n + " IS EVEN");
        }


    }
}
