package basic.string;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Yeshwantrao";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            rev += ch;
        }
        System.out.println(rev);
    }
}