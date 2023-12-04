public class DiamondAlphabetPattern {
    public static void main(String[] args) {
        int n = 5; // Change the value of 'n' to adjust the size of the diamond

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
