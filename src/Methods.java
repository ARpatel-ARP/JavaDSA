public class Methods {
    static void print2KaTable (){
        for (int i=1; i<=10; i++){
            System.out.println("->" + 2*i);
        }
    }

    static void printSum(int x, int y) {
        System.out.println("SUM=" + (x+y));
    }

    // non-void return-type
    static int mul(int a, int b) {
        int res = a*b;
        return res;
    }
    static void main() {
        int result = mul(5, 6);
        System.out.println(result);
//        printSum(5,5);
//        System.out.println("hi");
//        print2KaTable();
//        System.out.println("bye");
    }
}
