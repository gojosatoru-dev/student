class Date {
    int day;
    int month;
    int year;

    // Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int calculateAge(int currentDay, int currentMonth, int currentYear) {
        int age = currentYear - year;
        if (currentMonth < month || (currentMonth == month && currentDay < day)) {
            age--; // Adjust age if birthday hasn't occurred yet in the current year
        }
        return age;
    }

    public String toString() {
        return day + "-" + month + "-" + year;
    }
}

class Student {
    String name;
    Date dob;

    // Constructor
    public Student(String name, int day, int month, int year) {
        this.name = name;
        this.dob = new Date(day, month, year);
    }

    public void displayDetails(int currentDay, int currentMonth, int currentYear) {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + dob.calculateAge(currentDay, currentMonth, currentYear));
    }
}

public class Main {
    public static void main(String[] args) {
        // Example input: Date of Birth in DD-MM-YYYY format
        Student student = new Student("Amit", 01, 01, 2005);

        // Set the current date manually
        int currentDay = 29, currentMonth = 4, currentYear = 2025;

        student.displayDetails(currentDay, currentMonth, currentYear);
    }
}
