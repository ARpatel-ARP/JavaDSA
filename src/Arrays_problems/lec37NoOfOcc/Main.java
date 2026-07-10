package Arrays_problems.lec37NoOfOcc;

import java.util.Arrays;

public class Main {
    static int lowBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n;

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
        int ans = n; // if the max value of array is <= target ie no upper bound

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

    static int noOfOcc(int[] arr, int target) {
        // NOOcc = upp bound - lower bound ;
        int UB = uppBound(arr, target);
        int LB = lowBound(arr, target);
        return UB - LB;
    }

    static int[] fiAndLast(int[] arr, int target) {
            int n = arr.length;
            int s = 0;
            int e = n-1;
            int[] pos = {-1,-1};
            if (n==0) return pos;
            // find first by LOW_BOUND
            int first = -1;
            while (s<=e){
                int mid = s + (e-s)/2;
                if (arr[mid]>=target){
                    if (arr[mid] == target) first = mid;
                    e = mid -1;
                } else{
                    s = mid +1;
                }
            }
            pos[0] = first;
             s =0;
             e =n-1;
             int last = -1;
            while (s<=e){
                int mid = s + (e-s)/2;
                if (arr[mid]<=target){
                    if (arr[mid]==target) last = mid;
                    s = mid +1;
                } else{
                    e = mid -1;
                }
            }
            pos[1] = last;
            return pos;


    }

    static void main(String[] args) {
        int[] arr = {20,30,30,30,34,56,88,90};
//        System.out.println(lowBound(arr,88));
//        System.out.println(uppBound(arr, 30));
//        System.out.println(noOfOcc(arr, 30));
        System.out.println(Arrays.toString(fiAndLast(arr, 32)));
    }
}
