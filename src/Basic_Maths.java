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
    static void main() {
        int num = 53467;
        printDigOfNum(num);

    }
}
