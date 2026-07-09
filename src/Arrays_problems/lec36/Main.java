package Arrays_problems.lec36;

public class Main {
    static int binSearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end-start)/2; // prevents integer overflow

        while (start <= end){
            if (target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                // move to right
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
            mid = start + (end-start)/2;
        }
        return -1;

    }

    static void main(String[] args) {
        int[] arr = {20,30,34,56,88,90};
        System.out.println(binSearch(arr,90));
    }
}
