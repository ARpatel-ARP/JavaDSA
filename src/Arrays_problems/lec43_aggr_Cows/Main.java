package Arrays_problems.lec43_aggr_Cows;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static boolean isValid(int[] stall, int mid, int k) {
        int cowCount = 1;
        int lastPosition = 0;

        for (int i = 0; i < stall.length; i++) {
            if (stall[i] - stall[lastPosition] >= mid){
                //safe to place a cow
                cowCount++;
                // update the last pos
                lastPosition = i;
                // check if all cows placed ??
                if (cowCount == k){
                    return true;
                }
            }
        }
        return false;
    }

    static int aggrCow(int[] stall, int k) {
        Arrays.sort(stall);
        int n = stall.length;

        int s = 0;
        int e = stall[n-1] - stall[0];
        int ans = -1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if (isValid(stall, mid, k)){
                ans = mid;
                s = mid +1;
            }else{
                e = mid -1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] stall = {1,2,4,8,9};
        System.out.println(aggrCow(stall, 3));
    }
}
