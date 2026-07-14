package basic.string;

public class StringIsPalindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            rev += ch;
        }

        boolean flag = str.equals(rev);

        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}