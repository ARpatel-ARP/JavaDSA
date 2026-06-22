package Arrays_problems.part3_lec_29;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static void arrange0and1s(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while(i<=j){
            if (arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[i] == 0){
                i++;
            }
            if (arr[j] == 1){
                j--;
            }
        }
        for (int num:arr){
            System.out.println(num);
        }
    }

    static int missingNo_inArray(int[] arr, int n) {
        int xorSum =0;
       for (int i =0; i<=n; i++ ){
           xorSum = xorSum ^ i;
       }
       for (int num:arr){
           xorSum = xorSum ^ num;
       }
       return xorSum;

    }

    // if multiple values missing
    static List<Integer> mulMissing_Values(int[] arr, int n) {
        boolean[] seen = new boolean[n+1];
        for (int num : arr){
            seen[num] = true;
        }
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i <=n ; i++) {
            if (!seen[i]){
                missing.add(i);
            }
        }
        return missing;

    }

    static int findUniqueElement(int[] arr) {
        int ans = 0;
        for (int num:arr){
            ans = ans^num;
        }
        return ans;
    }


    static void main(String[] args) {
        int[] arr = {2,3,4,5,2,4,5};
//        arrange0and1s(arr);
//        System.out.println(missingNo_inArray(arr, 6));
//        System.out.println(mulMissing_Values(arr, 10));
        System.out.println(findUniqueElement(arr));
    }
}
