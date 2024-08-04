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
            int  studentID;
            int courseID;
            switch (option) {
                case 1:
                System.out.print("Enter student ID: ");
                 studentID = scanner.nextInt();
                System.out.print("Enter student name: ");
                String name = scanner.next();
        
                gradingSystem.addStudent(new Student1(studentID, name));
                    break;
                case 2:
                System.out.print("Enter student ID: ");
                 studentID = scanner.nextInt();
                System.out.print("Enter course ID: ");
                 courseID = scanner.nextInt();
                System.out.print("Enter grade: ");
                char grade = scanner.next().charAt(0);
        
                gradingSystem.addGrade(new Grade(studentID, courseID, grade));
                    break;
                case 3:
                System.out.print("Enter course ID: ");
                 courseID = scanner.nextInt();
                System.out.print("Enter course credits: ");
                int credits = scanner.nextInt();
        
                gradingSystem.addCourseCredits(courseID, credits);
                    break;
                case 4:
                System.out.print("Enter student ID: ");
                 studentID = scanner.nextInt();
        
                double gpa = gradingSystem.calculateGPA(studentID);
                System.out.println("GPA: " + gpa);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
        
    }

    
    }
