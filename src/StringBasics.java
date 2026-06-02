    public class StringBasics {
        static void main() {
            // string creation
//            String firstName = "Ankit";
//            String lastName =  new String("Raut");
//            System.out.println(firstName + " " + lastName);
//            System.out.println(firstName.length());
//            System.out.println(firstName.charAt(1));
            // String comparison
            String newName = "Ankit";
            String secondName = "ANKIT";
            if (newName == secondName ){
                System.out.println("refers to same literal in string pool");
            }else if (newName.equals(secondName)){
                System.out.println("every char is of same case");
            }else if (newName.equalsIgnoreCase(secondName)){
                System.out.println("Context of name are same");
            }
        }
    }
