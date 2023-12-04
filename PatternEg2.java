public class PatternEg2 {
    void printPattern(int number) {
        int i, j;
        for (i = 1; i <= number; i++) {
            for (j = 1; j <= number - 1; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = 8;
        PatternEg2 p = new PatternEg2();
        p.printPattern(number);
    }
}