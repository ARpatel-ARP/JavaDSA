package Arrays_problems.part2_lec28;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    static void revArray(int[] arr, int i, int j) {
        while (i<j){
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            // inc and dec
            i++;
            j--;
        }
//        for (int k:arr){
//            System.out.println(k);
//        }
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

    // approach - 1 by reversing array
//    static void shiftRightByK_times(int[] arr, int k) {
//        int n = arr.length;
//        k = k%n;
//        revArray(arr, 0, n-1);
//        revArray(arr, 0 , k-1);
//        revArray(arr, k, n-1);
//        for (int num:arr){
//            System.out.println(num);
//        }
//    }
    // approach - 2 (by using temp array)
    static void shiftRightByK_times(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];
        for (int i = 0; i < n ; i++) {
            temp[(i+k)%n] = arr[i];
        }
        for (int i = 0; i<n; i++){
            arr[i] = temp[i];
        }
        for (int num:arr){
            System.out.println(num);
        }

    }

    static void printExtElementsAlt(int[] arr) {
        int i = 0;
        int n = arr.length;
        int j = n-1;
        while (i<=j){
        if (i == j ){
            System.out.println(arr[i]);
            return;
        } else {
            System.out.println(arr[i]);
            i++;
            System.out.println(arr[j]);
            j--;
        }
    }
    }

    static int getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
//        for (int i : freq.keySet()){
//            System.out.println(i + " -> " + freq.get(i));
//        }
        // find max
        int maxFreq = -1;
        int maxFreq_key = -1;
        for (int key: freq.keySet()){
            int currentKey = key;
            int currentKey_Freq = freq.get(key);
            if (currentKey_Freq > maxFreq){
                maxFreq = currentKey_Freq;
                maxFreq_key = currentKey;
            }
        }
        return maxFreq_key;
    }

    static int[] getHiAndLowFreq(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num:arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // hashmap done
        // for highest :
        int highFreq = Integer.MIN_VALUE;
        int highFreq_Key = -1;
        for (int key : freq.keySet()){
            int currKey = key;
           int currKey_freq = freq.get(key);
           if (currKey_freq > highFreq){
               highFreq = currKey_freq;
               highFreq_Key = currKey;
           }
        }
        int lowFreq = Integer.MAX_VALUE;
        int lowFreq_key = -1;
        for ( int key : freq.keySet()){
            int currKey = key;
            int currKey_freq = freq.get(key);
            if (currKey_freq < lowFreq){
                lowFreq = currKey_freq;
                lowFreq_key = currKey;
            }
        }
        return new int[]{highFreq_Key, lowFreq_key};
    }

    static void unionOfArrays(int[] arr1, int[] arr2) {
        HashSet<Integer> union = new HashSet<>();
        for (int num: arr1){
            union.add(num);
        }
        for (int num : arr2 ){
            union.add(num);
        }
        System.out.println(union);
    }


    static void main(String[] args) {
        int[] arr1 = {2,2,2,33,3,3,3,4,5,5,4,4,4,4,4,4,4,4,4,4,4,4,4,5,6,};
        int[] arr2 = {2,2,2,8,8,3,3,3,4,5,5,4,4,4,4,4,4,4,4,4,4,4,4,4,5,6,};
        unionOfArrays(arr1, arr2);
//        int[] ans = getHiAndLowFreq(arr);
//        System.out.println("High freq key :" + ans[0]);
//        System.out.println("Low freq key :" + ans[1]);

//        revArray(arr);
//        shiftRightByOne(arr);
//        shiftRightByK_times(arr, 3);
//        printExtElementsAlt(arr);
//        System.out.println(getMode(arr));
    }
}
