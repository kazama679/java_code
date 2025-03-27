package ss20.entity;

public class Student {
    private String studentId;
    private String studentName;
    private int studentAge;

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student(int studentAge, String studentId, String studentName) {
        this.studentAge = studentAge;
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student() {
    }

    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge="+studentAge+"]";
    }
}
