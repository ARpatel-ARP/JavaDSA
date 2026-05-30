public class Arrays_2D {
    static void main() {
        // declaration
//        int [][] arr ;
        // alloc
//        arr = new int[3][4];
        //init
        int [][] brr = {
                {4,5},
                {6,7,4,5,6,4,5},
                {8,9}
        };
        // print all values:
//        int rowLen = brr.length;
////        int colLen = brr[0].length; // only applicable if all rows have same no. of col vals
//
//        for (int i=0; i<=rowLen-1; i++){
//            // to find the colLen for each row
//            int colLen = brr[i].length;
//            for (int j=0; j<=colLen-1; j++){
//                System.out.print(brr[i][j] + " ");
//            }
//            System.out.println();
//        }
        // Generalised version for traversal :
        int rowLen = brr.length;
        for (int rowIndex=0; rowIndex<=rowLen-1; rowIndex++){
            for (int colIndex=0; colIndex<=brr[rowIndex].length-1; colIndex++){
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }

    }
}
