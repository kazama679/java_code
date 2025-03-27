package ss20.stream;

import ss20.entity.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student(20, "SV001", "Nguyễn Văn A");
        Student student2 = new Student(19, "SV002", "Nguyễn Văn B");
        Student student3 = new Student(18, "SV003", "Nguyễn Văn C");
        Student student4 = new Student(22, "SV004", "Nguyễn Văn D");
        Student student5 = new Student(22, "SV005", "Nguyễn Văn E");
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        listStudents.add(student5);

        //1. in ra các sv có tuổi lớn hơn 20
        System.out.println("Thông tin các sinh viên có tuổi hơn 20: ");
        listStudents.stream().filter(student -> student.getStudentAge()>20).forEach(System.out::println);
        //2. in ra sv1-sv3
        System.out.println("thông tin sv1 -sv3: ");
        listStudents.stream().skip(1).limit(3).forEach(System.out::println);
        //4. in số tuổi của các sv với tuổi *2
        listStudents.stream().map(student->student.getStudentAge()*2).forEach(System.out::println);
        //5. in thông tin sv sắp xếp theo tuổi tăng dần
        listStudents.stream().sorted(Comparator.comparing(Student::getStudentAge)).forEach(System.out::println);
        System.out.println("Thông tin sv tuổi giảm dần: ");
        listStudents.stream().sorted(Comparator.comparing(Student::getStudentAge).reversed()).forEach(System.out::println);
        //6. in thông tin sắp xếp tên giảm dần
        System.out.println("Thông tin sv tên giảm dần: ");
        listStudents.stream().sorted(Comparator.comparing(Student::getStudentName).reversed()).forEach(System.out::println);
        //7. in thông tin sv sắp xếp theo tuổi tăng dần, nêú bằng tuổi thì sắp xếp theo tên giảm dần
        System.out.println("Tuổi tăng dần, nếu cùng tuổi tên giảm dần: ");
        listStudents.stream().sorted(Comparator.comparing(Student::getStudentAge).thenComparing(Comparator.comparing(Student::getStudentName).reversed())).forEach(System.out::println);

        //8. lưu thông tin các sinh viên có tuổi lớn hơn 20
        System.out.println("Những sv lớn hơn 20 tuổi: ");
        List<Student> list20 = listStudents.stream().filter(student -> student.getStudentAge()>20).toList();
        list20.forEach(System.out::println);
        //9. kiểm tra trong listStudents có sv tên là Nguyễn Văn A không
        System.out.println("Kết quả tìm kiếm sv Nguyên văn A: "+ listStudents.stream().anyMatch(student->student.getStudentName().equals("Nguyễn Văn A")));
        //10. tính số lượng sinh viên có tuổi lớn hơn 20
        System.out.println("Số lượng sv lớn hơn 20: "+listStudents.stream().filter(student -> student.getStudentAge()>20).count());
        //11. in ra tuổi lớn nhất
        System.out.println("tuổi lớn nhất: "+listStudents.stream().max(Comparator.comparing(Student::getStudentAge)));
        //12. Thống kê các số liệu về tuổi sinh viên: min, max, sum, avg
        IntSummaryStatistics agaStatitic = listStudents.stream().mapToInt(Student::getStudentAge).summaryStatistics();
        System.out.println("Tổng tuổi: "+agaStatitic.getSum());
        System.out.println("tuổi tb: "+agaStatitic.getAverage());
        //13. sử dụng reduce tính tổng tuổi sinh viên
        System.out.println("Tổng tuổi sinh viên: "+listStudents.stream().mapToInt(Student::getStudentAge).reduce(0, Integer::sum));

    }
}