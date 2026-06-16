package Arrays_problems.part2_lec28;

public class Main {
    static void revArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i<=j){
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            // inc and dec
            i++;
            j--;
        }
        for (int k:arr){
            System.out.println(k);
        }
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
    static void main(String[] args) {
        int[] arr = {2,3,4,5,6,};
//        revArray(arr);
        shiftRightByOne(arr);
    }
}
