package basic.string;

public class StringToUpperCase {
    public static void main(String[] args) {
        String str = "Yeshwantrao Chavan College";

        String upperStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                // alternate option :  upperStr += (char) (ch - 32);
                upperStr += (char) ('a' - 'A');
            } else {
                upperStr += ch;
            }
        }
        System.out.println(upperStr);
    }
}