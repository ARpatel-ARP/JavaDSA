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
                // we are on second line
                e = mid-1;
            } else{
                // we are on first line
                ans = mid;
                s = mid +1;

            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(findPivotIndex(arr));
    }
}
