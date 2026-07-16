package Arrays_problems.lec41_bookAlloc;

public class Main {
    static boolean isValid(int[] arr, int k, int mid) {
        int studCount = 1;
        int pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= mid){
                pages = pages + arr[i];
            }else{
                studCount++;
                if (studCount>k || arr[i]>mid){
                    return false;
                }else {
                    pages = 0;
                    pages += arr[i];
                }
            }
        }
        return true;
    }

    static int bookAlloc(int[] arr, int k) {
        int n = arr.length;
        if (n<k){

            return -1; // in case books are less than total students
        }
        int s=1;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int e = sum;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if (isValid(arr,k,mid)){
                ans = mid;
                e=mid-1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] arr = {12,34,67,90};
        System.out.println(bookAlloc(arr,4));
    }
}
