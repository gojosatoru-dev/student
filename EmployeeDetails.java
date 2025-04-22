class Employee {
    int id;
    String name;
    String designation;
    double salary;

    // Constructor
    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee(101, "John Doe", "Software Engineer", 75000);

        // Displaying employee details
        emp1.displayEmployeeDetails();
    }
}
