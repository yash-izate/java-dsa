package pattern;

public class SolidRightAngledTriangle {
    public static void main(String[] args) {
        int a = 10;
        
        int n = 5;

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}