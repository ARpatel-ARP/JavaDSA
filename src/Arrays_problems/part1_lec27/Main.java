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
    //p-5
    static int findMaxByMath_Max(int[] arr) {
        int max = arr[0];
        for (int num:arr){
            max = Math.max(max, num);
        }
        return max;
    }
//   p-6
    static void sumOfPosAndNeg(int[] arr) {
        int pos_sum = 0;
        int neg_sum = 0;
        for (int num:arr){

        }
    }

    static void main(String[] args) {
        int[] arr = {1,4,5,3,2,5,7,5,3};
//        System.out.println(findAvgOfArr(arr));
//        mulBy_10(arr);
//        linSearch(arr, 5);
        System.out.println(findMax(arr));
        System.out.println(findMaxByMath_Max(arr));
    }

}
