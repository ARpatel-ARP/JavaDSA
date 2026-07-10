package Arrays_problems.lec37NoOfOcc;

public class Main {
    static int lowBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while (s<=e){
            int mid = s + (e-s)/2;
            if (target <= arr[mid]){
                ans = mid;
                e = mid -1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    static int uppBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while (s<=e){
            int mid = s + (e-s)/2;

            if (arr[mid]<=target){
                // move right
                s = mid +1;
            }
            else{
                // arr[mid]>target
                ans = mid;
                e = mid -1;
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {20,30,30,30,34,56,88,90};
//        System.out.println(lowBound(arr,88));
        System.out.println(uppBound(arr, 30));
    }
}
