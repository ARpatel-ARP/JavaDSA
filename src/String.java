public class String {
    public class StringOperations {
        public static String addStrings(String num1, String num2) {
            StringBuilder result = new StringBuilder();
            int carry = 0;
            int i = num1.length() - 1;
            int j = num2.length() - 1;

            while (i >= 0 || j >= 0 || carry > 0) {
                int digit1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
                int digit2 = j >= 0 ? num2.charAt(j--) - '0' : 0;

                int sum = digit1 + digit2 + carry;
                result.append(sum % 10);
                carry = sum / 10;
            }

            return result.reverse().toString();
        }

        public static String multiplyStrings(String num1, String num2) {
            if (num1.equals("0") || num2.equals("0")) {
                return "0";
            }

            int[] result = new int[num1.length() + num2.length()];

            for (int i = num1.length() - 1; i >= 0; i--) {
                for (int j = num2.length() - 1; j >= 0; j--) {
                    int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                    int sum = mul + result[i + j + 1];

                    result[i + j + 1] = sum % 10;
                    result[i + j] += sum / 10;
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int num : result) {
                if (!(sb.length() == 0 && num == 0)) {
                    sb.append(num);
                }
            }

            return sb.toString();
        }

        public static void main(String[] args) {
            String a = "123";
            String b = "456";

            System.out.println("Addition: " + addStrings(a, b));
            System.out.println("Multiplication: " + multiplyStrings(a, b));
        }
    }
}
