public class Pattern_printing {
    static void main() {
        // PATTERN :1
//        for (int i =1; i<=4; i++){ // for row
//            for (int j = 1; j<=4; j++){ //  for col
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // Pattern :2
//        for (int i =1; i<=3; i++){
//            for (int j=1; j<=5; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
        // PATTERN : 3
        for (int row = 1; row<=5; row++ ){
            for (int col= 1; col<=row; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
