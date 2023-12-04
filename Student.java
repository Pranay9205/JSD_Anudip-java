// Student.java

public class Student {
    // Private member variables
    private String studentName;
    private String collegeName;
    private int studentID;

    // Constructor to initialize the member variables
    public Student(String studentName, String collegeName, int studentID) {
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.studentID = studentID;
    }

    // Getter method for studentName
    public String getStudentName() {
        return studentName;
    }

    // Getter method for collegeName
    public String getCollegeName() {
        return collegeName;
    }

    // Getter method for studentID
    public int getStudentID() {
        return studentID;
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student = new Student("John Doe", "ABC College", 12345);

        // Print a message
        System.out.println("Successful");

        // Access and print the member variables using getter methods
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("College Name: " + student.getCollegeName());
        System.out.println("Student ID: " + student.getStudentID());
    }
}
