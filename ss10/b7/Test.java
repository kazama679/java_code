package ss10.b7;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Nguyễn Xuân Quang", "SV101", 3.2);
        students[1] = new Student("Nguyễn Xuân B", "SV102", 3.7);
        students[2] = new GraduateStudent("Nguyễn Xuân C", "SV103", 3.85, "Xử lý ngôn ngữ tự nhiên trong AI", "GS. Nguyễn Văn A");
        students[3] = new GraduateStudent("Nguyễn Xuân D", "SV104", 3.95, "Ứng dụng IoT trong nông nghiệp", "PGS. Nguyễn Văn B");

        for (Student student : students) {
            System.out.println(student.getDetails());
        }
    }
}