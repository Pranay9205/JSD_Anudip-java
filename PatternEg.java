class PatternEg {
    void printPattern(int number) {
        int i, j;
        for (i = 1; i <= number; i++) {
            for (j = 1; j <= number - 1; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = 8;
        PatternEg p = new PatternEg();
        p.printPattern(number);
    }
}