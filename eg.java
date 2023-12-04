import java.util.Scanner;

class eg {
    void calc_table(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + (number * i));
        }
    }

    public static void main(String[] args) {
        eg e = new eg();
        Scanner sc = new Scanner(System.in);
        char status;

        do {
            System.out.print("enter a number :");
            int number = sc.nextInt();
            e.calc_table(number);
            System.out.println("would you like to continue y/n");
            status = sc.next().charAt(0);

        } while (status == 'Y');
    }
}