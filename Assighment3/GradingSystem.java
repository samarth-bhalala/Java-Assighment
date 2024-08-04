
public class GradingSystem {
    private Student1[] students;
    private Grade[] grades;
    private int[] courseCredits;
    private int studentCount;
    private int gradeCount;

    public GradingSystem(int maxStudents, int maxGrades) {
        students = new Student1[maxStudents];
        grades = new Grade[maxGrades];
        courseCredits = new int[maxGrades];
        studentCount = 0;
        gradeCount = 0;
    }

    public void addStudent(Student1 student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Maximum number of students reached.");
        }
    }

    public void addGrade(Grade grade) {
        if (gradeCount < grades.length) {
            grades[gradeCount] = grade;
            gradeCount++;
        } else {
            System.out.println("Maximum number of grades reached.");
        }
    }

    public void addCourseCredits(int courseID, int credits) {
        courseCredits[courseID] = credits;
    }

    public double calculateGPA(int studentID) {
        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < gradeCount; i++) {
            if (grades[i].getStudentID() == studentID) {
                totalPoints += gradeToPoints(grades[i].getGrade()) * courseCredits[grades[i].getCourseID()];
                totalCredits += courseCredits[grades[i].getCourseID()];
            }
        }

        if (totalCredits == 0) {
            return 0;
        }

        return totalPoints / totalCredits;
    }

    private int gradeToPoints(char grade) {
        switch (grade) {
            case 'A':
                return 4;
            case 'B':
                return 3;
            case 'C':
                return 2;
            case 'D':
                return 1;
            case 'F':
                return 0;
            default:
                return 0;
        }
    }

    
}