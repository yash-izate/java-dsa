package basic.string;

public class StringConsonantCount {
    public static void main(String[] args) {

        String str = "All Indians are my brother and sisters.";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                        ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                    count++;
                }
            }
        }

        System.out.println("String Length = " + str.length());
        System.out.println("Number of consonants = " + count);
    }
}