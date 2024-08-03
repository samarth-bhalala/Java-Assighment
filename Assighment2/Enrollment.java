public class Enrollment {
    private int[][] studentCourses;
    private int[] count;

    public Enrollment(int numStudents, int numCourses) {
        studentCourses = new int[numStudents][numCourses];
        count = new int[numStudents];
    }

    public void enroll(int studentID, int courseID) {
        if (count[studentID] < studentCourses[studentID].length) {
            studentCourses[studentID][count[studentID]++] = courseID;
            System.out.println("Student " + (studentID + 1) + " enrolled in course " + courseID);
        } else {
            System.out.println("Student " + (studentID + 1) + " is already enrolled in the maximum number of courses");
        }
    }

    public void drop(int studentID, int courseID) {
        for (int i = 0; i < count[studentID]; i++) {
            if (studentCourses[studentID][i] == courseID) {
                for (int j = i; j < count[studentID] - 1; j++) {
                    studentCourses[studentID][j] = studentCourses[studentID][j + 1];
                }
                count[studentID]--;
                System.out.println("Student " + (studentID + 1) + " dropped from course " + courseID);
                return;
            }
        }
        System.out.println("Student " + (studentID + 1) + " is not enrolled in course " + courseID);
    }

    public void getEnrolledCourses(int studentID, Course[] courseCatalog) {
        System.out.println("Student " + (studentID + 1) + " is enrolled in the following courses:");
        for (int i = 0; i < count[studentID]; i++) {
            int courseID = studentCourses[studentID][i];
            for (Course course : courseCatalog) {
                if (course.getCourseID() == courseID) {
                    System.out.println(course);
                    break;
                }
            }
        }
    }
}