import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the marks: ");
            double marks = scanner.nextDouble();

            if (marks >= 0 && marks <= 100) {
                String grade = calculateGrade(marks);
                System.out.println("The grade for " + marks + " marks is: " + grade);
            } else {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a numeric value for marks.");
        } finally {
            scanner.close();
        }
    }

    // Function to calculate the grade based on marks
    private static String calculateGrade(double marks) {
        if (marks >= 90 && marks <= 100) {
            return "A+";
        } else if (marks >= 80 && marks < 90) {
            return "A";
        } else if (marks >= 70 && marks < 80) {
            return "B";
        } else if (marks >= 60 && marks < 70) {
            return "C";
        } else if (marks >= 50 && marks < 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
