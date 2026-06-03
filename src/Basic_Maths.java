public class Basic_Maths {

    static void printDigOfNum(int num ) {
        while (num != 0){
            // extract the last digit
            int digit = num%10;
            System.out.println(digit);
            // remove the last digit
            num = num/10;
        }
    }
    static  void printDigInRev(int num){
        // init array
        int digits[] = new int[10];
        int counts = 0;

        while (num != 0){
            digits[counts++] = num%10;
            num = num/10;
        }
            System.out.println(counts); // total count of digits
        for (int i = counts-1; i >= 0; i--) {
            System.out.println(digits[i]);
        }
    }

    static int sumOfDigs(int num) {
        int sum = 0;
        while (num != 0){
            int digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
    }

    static void revNumber(int num) {
        int ans = 0;
        while (num!=0){
            ans = ans*10;
            int digit = num%10;
            ans = digit + ans;
            num = num/10;
        }
        System.out.println(ans);
    }

    static Boolean palindromeNum(int num) {
        int ans = 0;
        int original = num;
        while (num!=0){
            ans = ans*10;
            int digit = num%10;
            ans = digit + ans ;
            num = num/10;
        }
        if (ans!=original){
            return false;
        } else {
        return true;
        }
    }

    static Boolean primeNum(int num) {
        // optimized way :
        for (int i = 2; i <= (num^1/2) ; i++) {
            if (num%i==0){
                System.out.println(num + " is not a prime No.");
                return false;
            }

        }
//        for (int i = 2; i < num-1; i++) {
//            if (num%i==0){
//                System.out.println(num + "is not a prime No.");
//                return false;
//            }
//        }
        System.out.println(num + "is a prime number");
                return true;
    }

    static int GCDofNum(int a, int b) {
        // gcd(a,b) = gcd(b, a%b)
        while (b != 0){
            int temp = b; // old value of b
            b = a%b;
            a = temp;
        }
        return a;
    }

    static int lcmOf(int a, int b) {
        int gcd = GCDofNum(a,b);
        return (a*b)/gcd;
    }

    static Boolean armStrong(int num) {
        int sum = 0;
        int orignal = num;
        while (num!=0){
            int digit = num%10;
            int cubeOfDig = digit*digit*digit;
            sum = sum + cubeOfDig;
            num = num / 10;
        }
        if (sum!=orignal){
            return false;
        }
        return true;
    }
    static void main() {
        int num = 11;
//        printDigOfNum(num);
//        printDigInRev(num);
//        System.out.println(sumOfDigs(num));
//        revNumber(num);
//        System.out.println(palindromeNum(num));
//        System.out.println(primeNum(num));
//        System.out.println(GCDofNum(18,12));
//        System.out.println(GCDofNum(12,14));
        System.out.println(armStrong(153));
    }
}
