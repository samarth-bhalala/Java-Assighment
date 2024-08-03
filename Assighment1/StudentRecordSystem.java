
// StudentRecordSystem.java
import java.util.ArrayList;

public class StudentRecordSystem {
    private ArrayList<Student> students;

    public StudentRecordSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(int studentID) {
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
