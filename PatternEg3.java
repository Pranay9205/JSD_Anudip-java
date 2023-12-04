public class PatternEg3 {
    void printPattern(int number) {
        int i, j;
        for (i = 1; i <= number; i++) {
            for (j = 1; j <= number - 1; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // --------------------
        for (i = number - 1; i >= 1; i--) {
            for (j = 1; j <= number - 1; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = 8;
        PatternEg3 p = new PatternEg3();
        p.printPattern(number);
    }
}