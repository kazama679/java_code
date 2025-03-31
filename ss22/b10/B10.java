package ss22.b10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B10 {
    public static final List<Student> students = new ArrayList<Student>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        students.add(new Student(3.7, "IT", "NXQ"));
        students.add(new Student(3.6, "IT", "NXA"));
        students.add(new Student(3.4, "IT2", "NXB"));

        StudentManager.saveToFile(students);
        StudentManager.loadFromFile();
        System.out.println("Sinh viên có điểm trung bình cao nhất: "+StudentManager.findTopStudent());
        System.out.println("Danh sách sinh viên theo chuyên ngành: "+StudentManager.searchByMajor("IT"));
        System.out.println("Điểm trung bình của sinh viên: "+StudentManager.calculateAverageGpa());
    }
}
