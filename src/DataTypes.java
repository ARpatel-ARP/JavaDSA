public class DataTypes {
    static void main(){
        //Numeric DT - byte, int, short, long
        byte num1  = 127;
        System.out.println(num1);
        // but byte num = 500 will throw error (range = -128 to 127)
        short num2 = 32767;
        System.out.println(num2);
        // range = -32768 to 32767
        int num3 = 50000;
        long num4 = 444444445;
        System.out.println(num3);
        System.out.println(num4);

        float num5 = 3.142436f;
        System.out.println(num5);

        double num6 = 3.1455555555555555555555555555555555555555555555555555;
        System.out.println(num6);
        // output : 3.1455555555555557 (round off after 15)

        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char firstCharacter = 'a';
        System.out.println("The first character is:" + firstCharacter);
        System.out.println("The first character is:" + (char)(firstCharacter+2)); // explicit conversion


    }
}
