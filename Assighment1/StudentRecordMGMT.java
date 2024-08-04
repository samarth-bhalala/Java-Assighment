import java.util.Scanner;
public class StudentRecordMGMT {
    public static void main(String[] args) {
        StudentRecordSystem system = new StudentRecordSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Get Student by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int studentID = scanner.nextInt();
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter student department: ");
                    String department = scanner.next();
                    Student student = new Student(studentID, name, age, department);
                    system.addStudent(student);
                    break;
                case 2:
                    system.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter student ID to retrieve: ");
                    int retrieveID = scanner.nextInt();
                    Student retrievedStudent = system.getStudent(retrieveID);
                    if (retrievedStudent != null) {
                        System.out.println(retrievedStudent.toString());
                    } else {
                        System.out.println("Student not found");
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
        
        

    }
    
    
}