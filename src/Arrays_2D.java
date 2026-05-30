public class Arrays_2D {
    static void main() {
        // declaration
        int [][] arr ;
        // alloc
        arr = new int[3][4];
        //init
        int [][] brr = {
                {4,5},
                {6,7},
                {8,9}
        };
        System.out.println(brr[2][1]);
        // print all values:
        int rowLen = brr.length;
        int colLen = brr[0].length; // only applicable if all rows have same no. of col vals

        for (int i=0; i<=rowLen-1; rowLen++){
            for (int j=0; j<=colLen-1; colLen++){
                System.out.println(brr[i][j] + "");
            }
        }
    }
}
