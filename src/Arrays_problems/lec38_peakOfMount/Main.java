package Arrays_problems.lec38_peakOfMount;

public class Main {
    static int peakOfMount(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n;
         while (s<=e){
             int mid = s + (e-s)/2;
             if (arr[mid]>=arr[mid+1]){ // right part
                 ans = mid;
                 e = mid-1;
             }else{
                 s = mid+1;
             }
         }
         return ans;

    }
    static void main(String[] args) {
        int[] arr = {1,3,5,2,4};
        System.out.println(peakOfMount(arr));
    }
}
