package practice.string;

public class PrintStringChar {
    public static void main(String[] args) {
        String str = "Independence";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            count++;
        }
        System.out.println("Number Of character: " + count);
    }
}