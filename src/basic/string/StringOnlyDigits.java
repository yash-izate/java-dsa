package basic.string;

public class StringOnlyDigits {
    public static void main(String[] args) {

        String str = "97456";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {
                System.out.println("No, string contains non-digit characters.");
                return;
            }
        }

        System.out.println("Yes, string contains only digits.");
    }
}