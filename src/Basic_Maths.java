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
    static void main() {
        int num = 53467;
//        printDigOfNum(num);
//        printDigInRev(num);
        System.out.println(sumOfDigs(num));
    }
}
