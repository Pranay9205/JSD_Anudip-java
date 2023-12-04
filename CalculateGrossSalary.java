import java.util.Scanner;

public class CalculateGrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Input basic salary from the user
            System.out.println("Enter the basic salary (enter -1 to exit):");
            double basicSalary = scanner.nextDouble();

            // Check if the user wants to exit
            if (basicSalary == -1) {
                System.out.println("Exiting the program.");
                break;
            }

            // Calculate HRA and DA based on the given conditions
            double hra, da;
            if (basicSalary > 15000) {
                hra = 0.20 * basicSalary;
                da = 0.60 * basicSalary;
            } else {
                hra = 3000;
                da = 0.70 * basicSalary;
            }

            // Calculate gross salary
            double grossSalary = basicSalary + hra + da;

            // Display the result
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("Gross Salary: " + grossSalary);
        }

        scanner.close();
    }
}
