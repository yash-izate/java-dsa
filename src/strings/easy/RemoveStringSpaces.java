package strings.easy;

public class RemoveStringSpaces {
    public static void main(String[] args) {
        String str = "I am a Doctor.";

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                newStr += ch;
            }
        }
        System.out.println(newStr);
    }
}