public class Student {
    // Data members
    int rollNo;
    String name;
    String aadhaarNumber;

    // Constructor
    public Student(int rollNo, String name, String aadhaarNumber) {
        this.rollNo = rollNo;
        this.name = name;
        this.aadhaarNumber = aadhaarNumber;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Aadhaar Number: " + aadhaarNumber);
    }

    // Main method to create and display student objects
    public static void main(String[] args) {
        // Creating a student object
        Student student1 = new Student(11, "Aman Gupta", "7690-5437-9923");

        // Displaying student details
        student1.display();
    }
}
