import java.util.Scanner;

class ForEg {

	void calc_Table(int number) {
		char status;
		do {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Value is :  " + (number * i));
				System.out.println("Do you want to continue Y/N ");
				status = sc.nextChar();
			}
		} while (status == 'Y');
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); // scanner object
		System.out.println("Enter number");
		int number = sc.nextInt(); // input from user

		ForEg e = new ForEg();
		e.calc_Table(number);
	}
}