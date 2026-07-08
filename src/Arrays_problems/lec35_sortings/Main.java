package Arrays_problems.lec35_sortings;

public class Main {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                // swap
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void selSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[min]){
                     min = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void insSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = i;
            int prev = i - 1;
            int currValue = arr[curr];
            while (prev>=0 && currValue < arr[prev]){
                // shift
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currValue;
        }
    }

    static void main(String[] args) {
        int[] arr = {5,6,3,1};
//        bubbleSort(arr);
//        selSort(arr);
        insSort(arr);
        System.out.println("printing array");
        for (int value:arr){
            System.out.println(value  );
        }
    }
}
