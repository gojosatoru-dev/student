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

class Semester {
    String course1;
    int marks1;
    String course2;
    int marks2;

    // Constructor
    public Semester(String course1, int marks1, String course2, int marks2) {
        this.course1 = course1;
        this.marks1 = marks1;
        this.course2 = course2;
        this.marks2 = marks2;
    }

    public void displayCourses() {
        System.out.println("Course 1: " + course1 + ", Marks: " + marks1);
        System.out.println("Course 2: " + course2 + ", Marks: " + marks2);
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Amit", 01, 01, 2005);

        // Set the current date manually
        int currentDay = 29, currentMonth = 4, currentYear = 2025;

        student.displayDetails(currentDay, currentMonth, currentYear);

        // Create Semester objects
        Semester semester1 = new Semester("Devops", 85, "bigdata", 78);
        Semester semester2 = new Semester("java", 90, "oops", 88);

        System.out.println("\nSemester 1:");
        semester1.displayCourses();

        System.out.println("\nSemester 2:");
        semester2.displayCourses();
    }
}
