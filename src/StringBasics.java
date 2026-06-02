import java.util.Scanner;

public class StringBasics {
        static void main() {
            // string creation
//            String firstName = "Ankit";
//            String lastName =  new String("Raut");
//            System.out.println(firstName + " " + lastName);
//            System.out.println(firstName.length());
//            System.out.println(firstName.charAt(1));
            // String comparison
            Scanner sc = new Scanner(System.in);
//            System.out.println("enter the First Name");
//            String newName = sc.next();
//            System.out.println("enter the First Name");
//            String secondName = sc.nextLine(); // can take the whole line with spaces between mul strings
//
//            if (newName == secondName ){
//                System.out.println("refers to same literal in string pool");
//            }else if (newName.equals(secondName)){
//                System.out.println("every char is of same case");
//            }else if (newName.equalsIgnoreCase(secondName)){
//                System.out.println("Context of name are same");
//            }
//            // isEmpty and blank
//           String emptyStr = "";
//            System.out.println(emptyStr.length());
//            System.out.println(emptyStr.isEmpty());
//            System.out.println("enter Blank string");
//            String blankStr = sc.nextLine();
//            System.out.println(blankStr.length());
//            System.out.println(blankStr.isBlank());

            // TRIM()
                String name = "  anKIt  ";
//            System.out.println(name.length());
//           name = name.trim(); // removes blank spaces
//            System.out.println(name.length());
//            System.out.println(name);

            // Upper  and lower case
//            System.out.println(name.toUpperCase());
//            System.out.println(name.toLowerCase());

//            // SubString
            String str = "They call me RAUT";
//            System.out.println(str.substring(13, 17)); // prints RAUT

//            // CONTAIN and startsWith , endswith
//            System.out.println(str.contains("Raut")); // false
//            System.out.println(str.startsWith("They"));// true
//            System.out.println(str.endsWith("RAUT")); // true

            // VALUE OF - STORE INT AS STRING
//            int num = 5433;
//            String strr = String.valueOf(num);
//            System.out.println(num + 1); // adds one
//            System.out.println(strr + 1); // concatenate one
            // STRING INTO CHAR ARR
//            char[] crr = name.toCharArray();
//            for (char ch: crr){
//                System.out.println("value = " + ch);
//            }
            // Splits into words
            String input = "I AM the danger kyler";
            String[] srr = input.split(" ");
            for (String sr: srr){
                System.out.println("word:" + sr );
            }




        }
    }
