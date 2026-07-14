package basic.string;

public class StringCharFrequency {
    public static void main(String[] args) {
        String str = "Independence";
        char letter = 'e';
        int freq = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == letter) {
                freq++;
            }
        }
        System.out.printf("Occurrence of '%c' in string \"%s\" = %d", letter, str, freq);
    }
}