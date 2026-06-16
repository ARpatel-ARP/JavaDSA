package Arrays_problems.part2_lec28;

public class Main {
    static void revArray(int[] arr, int i, int j) {
        while (i<j){
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            // inc and dec
            i++;
            j--;
        }
//        for (int k:arr){
//            System.out.println(k);
//        }
    }

    static void shiftRightByOne(int[] arr) {
        int temp = arr[arr.length-1];
        for (int i = arr.length -1 ; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for (int k:arr){
            System.out.println(k);
        }
    }

    // approach - 1 by reversing array
    static void shiftRightByK_times(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        revArray(arr, 0, n-1);
        revArray(arr, 0 , k-1);
        revArray(arr, k, n-1);
        for (int num:arr){
            System.out.println(num);
        }
    }
    static void main(String[] args) {
        int[] arr = {2,3,4,5,6,};
//        revArray(arr);
//        shiftRightByOne(arr);
        shiftRightByK_times(arr, 3);
    }
}
