public class Employee {
    // Protected member variables
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    // Main method
    public static void main(String[] args) {
        // Create an instance of the Employee class
        Employee employee = new Employee();

        // Assign values to the member variables
        employee.id = 123;
        employee.name = "John Doe";
        employee.isPermanent = true;

        // Correct the error by casting the value 35.5 to int
        employee.age = (int) 35.5;

        // Print a message
        System.out.println("Successfully started");

        // Print employee details
        System.out.println("ID: " + employee.id);
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Is Permanent: " + employee.isPermanent);
    }
}
