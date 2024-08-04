import java.util.Scanner;

public class GradingSystemMGTM {
    public static void main(String[] args) {
        GradingSystem gradingSystem = new GradingSystem(10, 20);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. Add Course Credits");
            System.out.println("4. Calculate GPA");
            
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addStudent(gradingSystem, scanner);
                    break;
                case 2:
                    addGrade(gradingSystem, scanner);
                    break;
                case 3:
                    addCourseCredits(gradingSystem, scanner);
                    break;
                case 4:
                    calculateGPA(gradingSystem, scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void addStudent(GradingSystem gradingSystem, Scanner scanner) {
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();
        System.out.print("Enter student name: ");
        String name = scanner.next();

        gradingSystem.addStudent(new Student(studentID, name));
    }

     private static void addGrade(GradingSystem gradingSystem, Scanner scanner) {
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();
        System.out.print("Enter course ID: ");
        int courseID = scanner.nextInt();
        System.out.print("Enter grade: ");
        char grade = scanner.next().charAt(0);

        gradingSystem.addGrade(new Grade(studentID, courseID, grade));
    }

    private static void addCourseCredits(GradingSystem gradingSystem, Scanner scanner) {
        System.out.print("Enter course ID: ");
        int courseID = scanner.nextInt();
        System.out.print("Enter course credits: ");
        int credits = scanner.nextInt();

        gradingSystem.addCourseCredits(courseID, credits);
    }

    private static void calculateGPA(GradingSystem gradingSystem, Scanner scanner) {
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();

        double gpa = gradingSystem.calculateGPA(studentID);
        System.out.println("GPA: " + gpa);
    }

    }
