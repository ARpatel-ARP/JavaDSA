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
            // isEmpty and blank
           String emptyStr = "";
            System.out.println(emptyStr.length());
            System.out.println(emptyStr.isEmpty());
            System.out.println("enter Blank string");
            String blankStr = sc.nextLine();
            System.out.println(blankStr.length());
            System.out.println(blankStr.isBlank());

        }
    }
