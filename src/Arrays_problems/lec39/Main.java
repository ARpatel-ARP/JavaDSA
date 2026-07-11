package Arrays_problems.lec39;

public class Main {
    static int findPivotIndex(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        if (arr[s]<arr[e]) return ans;

        while (s<=e){
            int mid = s+(e-s)/2;
            if (arr[mid]<=arr[n-1]){
                // we are on second line, move left
                e = mid-1;
            } else{
                // we are on first line
                ans = mid;
                s = mid +1;

            }
        }
        return ans;
    }

    static int binSearch(int[] arr, int start, int end, int target) {
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

    static int searchInRotatedArray(int[] arr, int target) {
        // find the pivot index
        int pivIndex = findPivotIndex(arr);
        int n = arr.length;
        // if pivIndex = -1 i.e, not rotated or single element present
        if (pivIndex == -1){
            return binSearch(arr,0,n-1,target);
        }
        else{
            // div the array into two parts L1 and L2
            // for L1 part
            int startL1 = 0;
            int endL1 = pivIndex;
            if (target <= arr[endL1] && target >= arr[startL1]){
            return binSearch(arr,startL1,endL1,target);
            }
            // for L2
            int startL2 = pivIndex +1;
            int endL2 = n-1;
            if (target <= arr[endL2] && target >= arr[startL2]){
                return binSearch(arr, startL2, endL2, target);
            }
        }
        return -1;
    }
    static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
//        System.out.println(findPivotIndex(arr));
        System.out.println(searchInRotatedArray(arr, 6));
    }
}
