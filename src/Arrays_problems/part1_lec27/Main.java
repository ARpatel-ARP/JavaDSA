package Arrays_problems.part1_lec27;

public class Main {
    // p-1
    static double findAvgOfArr(int[] arr) {
         double sum =0;
         for (int num:arr){
            sum = sum + num;
         }
         double avg = sum/arr.length;
         return avg;
    }
    //p-2
    static void mulBy_10(int[] arr){
        for (int num : arr){
            num = num*10;
            System.out.println(num);
        }
    }
    //p-3
    static void linSearch(int[] arr, int num) {
        for (int i=0; i<arr.length; i++){
            if (arr[i]==num){
                System.out.println(num + " Found at index : "+ i);
            }else {
                System.out.println("Not found");
            }
        }
    }
    //p-4
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num:arr){
            if (max<num){
                max = num;
            }
        }
        return max;
    }
    //p-4
    static int findMaxByMath_Max(int[] arr) {
        int max = arr[0];
        for (int num:arr){
            max = Math.max(max, num);
        }
        return max;
    }
//   p-5
    static void sumOfPosAndNeg(int[] arr) {
        int pos_sum = 0;
        int neg_sum = 0;
        for (int num:arr){
            if (num<0){
                neg_sum = neg_sum + num;
            } else if (num>0) {
                pos_sum = pos_sum + num;
            }
        }
        System.out.println("Sum of positive integers are : " + pos_sum);
        System.out.println("Sum of negative integers are : " + neg_sum);
    }
    // count no of 0s and 1s
    static void count0and1(int[] arr) {
        int countOf_1 = 0;
        int countOf_0 = 0;
        for (int num:arr){
            if (num == 0){
                countOf_0++ ;
            }
            else if (num == 1){
                countOf_1++ ;
            }
        }
        System.out.println("no of 0s in array are : " + countOf_0);
        System.out.println("no of 1s in array are : " + countOf_1);

    }

    static void main(String[] args) {
        int[] arr = {1,0,1,0,0,0,1,1,1,1};
//        System.out.println(findAvgOfArr(arr));
//        mulBy_10(arr);
//        linSearch(arr, 5);
//        System.out.println(findMax(arr));
//        System.out.println(findMaxByMath_Max(arr));
//        sumOfPosAndNeg(arr);
        count0and1(arr);
    }

}
