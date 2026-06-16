package Arrays_problems.part1_lec27;

public class Main {
    static int findAvgOfArr(int[] arr) {
         int sum =0;
         for (int num:arr){
            sum = sum + num;
         }
         int avg = sum/arr.length;
         return avg;
    }

    static void main(String[] args) {
        int[] arr = {1,4,5,3,2,5,7,5,3};
        System.out.println(findAvgOfArr(arr));
    }

}
