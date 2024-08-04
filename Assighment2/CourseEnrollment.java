import java.util.Scanner;

public class CourseEnrollment {
    public static Course[] courseCatalog;
    public static Enrollment enrollment;

    public CourseEnrollment(int numCourses, int numStudents) {
        courseCatalog = new Course[numCourses];
        enrollment = new Enrollment(numStudents, numCourses);
    }

    public void addCourse(int courseID, String courseName, int credits) {
        courseCatalog[courseID - 1] = new Course(courseID, courseName, credits);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        CourseEnrollment courseEnrollment = new CourseEnrollment(numCourses, numStudents);

        for (int i = 1; i <= numCourses; i++) {
            System.out.print("Enter course " + i + " ID: ");
            int courseID = scanner.nextInt();
            System.out.print("Enter course " + i + " name: ");
            String courseName = scanner.next();
            System.out.print("Enter course " + i + " credits: ");
            int credits = scanner.nextInt();
            courseEnrollment.addCourse(courseID, courseName, credits);
        }

        while (true) {
            System.out.println("1. Enroll student in course");
            System.out.println("2. Drop student from course");
            System.out.println("3. Print enrolled courses");
            System.out.println("4. Exit ");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int studentID = scanner.nextInt();
                    System.out.print("Enter course ID: ");
                    int courseID = scanner.nextInt();
                    enrollment.enroll(studentID - 1, courseID);

                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    studentID = scanner.nextInt();
                    System.out.print("Enter course ID: ");
                    courseID = scanner.nextInt();
                    enrollment.drop(studentID - 1, courseID);
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    studentID = scanner.nextInt();
                    enrollment.getEnrolledCourses(studentID - 1, courseCatalog);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
    }
}