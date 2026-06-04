
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
//        for (int row = 1; row<=5; row++ ){
//            for (int col= 1; col<=row; col++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//            int n = 5;
//        for (int i =1; i<=n; i++ ){
//            // for the spaces:
//            for (int j =1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            // for the *'s
//            for (int k =1; k<=n; k++){
//                System.out.print(" * ");
//            }
//            System.out.println(); // next ln
//
//        }
        // PATTERN 5:
//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5-i+1; j++ ){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
        //Pattern : 6

//        for (int i=1; i<=5; i++ ){
//            // for spaces
//            for (int j=1; j<=5-i; j++ ){
//                System.out.print("  ");
//            }
//            // for star
//            for (int k=1; k<=2*i-1; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // PATTERN : 7 (Hollow square)
//        for (int row=1; row<=4; row++){
//            for (int col=1; col<=6; col++){
//                if (row == 1 || row == 4){
//                    System.out.print("* ");
//                } else {
//                    if (col == 1 || col == 6){
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//
//        }
        //PATTERN : 8 (HOLLOW TRIANGLE)
//        for (int row=1; row<=5; row++){
//            if (row==1 || row==2 || row==5){
//                for (int col=1; col<=row; col++){
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//                for (int col =1; col<=(row-2); col++){
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // PATTERN : 9
//        for (int row=1; row<=5; row++){
//            //pt-1 spaces
//            for (int col=1; col<=(5-row); col++){
//                System.out.print("  ");
//            }
//            // pt-2 star space star
//            if (row==1 || row==5){
//                for (int col=1; col<=(2*row-1); col++){
//                    System.out.print("* ");
//                }
//            }else {
//                System.out.print("* ");
//                for (int col=1; col<=(2*row-3); col++){
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // PATTERN :10
//        for (int row=1; row<=4; row++){
//            for (int col=1; col<=(4-row); col++){
//                System.out.print("  ");
//            }
//            for (int col=1; col<=(2*row-1); col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int row=1; row<=4; row++){
//            if (row==1){
//                continue;
//            }
//            for (int col=1; col<=(row-1); col++ ){
//                System.out.print("  ");
//            }
//            for (int col=1; col<=(8-2*row+1); col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // PATTERN : 11
//        for (int row=1; row<=4; row++) {
//            for (int col=1; col<=4-row; col++){
//                System.out.print("  ");
//            }
//            System.out.print("* ");
//            if (row>1){
//            for (int col=1; col<=(2*row-3); col++){
//                System.out.print("  ");
//            }
//            System.out.print("* ");
//            }
//        System.out.println();
//
//        }
//
//        for (int row =3; row >= 1; row--) {
//            for (int col = 1; col <= 4 - row; col++) {
//                System.out.print("  ");
//            }
//            // Left star
//            System.out.print("* ");
//            // Inner spaces + right star (only if not last row)
//            if (row > 1) {
//                for (int col = 1; col <= 2 * row - 3; col++) {
//                    System.out.print("  ");
//            }
//            System.out.println();
//
//        }
        // PATTERN : 12
//        int n=4;
//
//        for (int row=1; row<=n; row++){
//            // pt-1
//                for (int col=1; col<=row; col++){
//                    System.out.print("* ");
//                }
//            //pt-2
//            for (int col=1; col<=2*(n-row); col++){
//                System.out.print("  ");
//            }
//            //pt-3
//            for (int col=1; col<=row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//
//        }
//       // inverted part
//        for (int row=1; row<=n; row++){
//            if (row==1){
//                continue;
//            }
//        //pt - 6
//            for (int col=1; col<=n+1-row; col++){
//                System.out.print("* ");
//            }
//            //pt-7
//            for (int col=1; col<=2*row-2; col++){
//                System.out.print("  ");
//            }
//            //pt-8
//            for (int col=1; col<=n+1-row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
        // PATTERN :15
//        int n=4;
//        for (int row=1; row<=n; row++){
//            for (int col=1; col<=row; col++){
//                System.out.print(col);
//            }
//            System.out.println();
//        }
        //PATTERN : 16
//        int n=5;
//        int count=1;
//        for (int row=1; row<=n; row++){
//            for (int col=1; col<=row; col++){
//                System.out.print(count + " ");
//                count++;
//            }
//            System.out.println();
//        }
        //PATTERN : 17
//        int n =5;
//        for (int row=1; row<=n; row++){
//            for (int col=1; col<=row; col++){
//             int b = ('A' - 1);
//             int ans = col+b;
//             char finalAns = (char)ans;
//                System.out.print(finalAns + " ");
//            }
//            System.out.println();
//        }
        //  PATTERN : 18
        int n = 4;
//        for (int row=1; row<=n; row++){
//            for (int col=1; col<=row; col++){
//                int a = n-col;
//                int b = 'A';
//                int ans = a + b;
//                char finalAns = (char)ans;
//                System.out.print(finalAns + " ");
//            }
//            System.out.println();
//        }
        // PATTERN : 19
//        for (int row=1; row<=n; row++){
//            for (int col=1; col<=n-row; col++){
//                System.out.print("  ");
//            }
//            for (int col=1; col<=row; col++){
//                System.out.print(col + " ");
//            }
//            int decRowValue = row-1;
//            for (int col=1; col<=row-1; col++){
//                System.out.print(decRowValue + " ");
//                decRowValue--;
//            }
//            System.out.println();
//

    }
}
