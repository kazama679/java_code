package ss17.deHackathon1.bussiness;

import ss17.deHackathon1.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentBusiness {
    private List<Student> studentList = new ArrayList<>();
    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        for (Student student : studentList) {
            student.displayData();
        }
    }

    public void addStudents(Scanner scanner) {
        System.out.print("Nhập số lượng sinh viên cần thêm: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            Student student = new Student();
            student.inputData(scanner);
            studentList.add(student);
            System.out.println("Thêm sinh viên thành công!");
        }
    }

    public void editStudent(Scanner scanner) {
        System.out.print("Nhập mã sinh viên cần chỉnh sửa: ");
        String studentId = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                student.inputData(scanner);
                System.out.println("Chỉnh sửa thông tin thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }

    public void deleteStudent(Scanner scanner) {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String studentId = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                System.out.print("Bạn có chắc chắn muốn xóa sinh viên này? (Y/N): ");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    studentList.remove(student);
                    System.out.println("Xóa sinh viên thành công!");
                } else {
                    System.out.println("Hủy thao tác xóa!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }

    public void searchStudent(Scanner scanner) {
        System.out.print("Nhập tên hoặc lớp cần tìm: ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (Student student : studentList) {
            if (student.getStudentName().toLowerCase().contains(keyword) ||
                    student.getClassName().toLowerCase().contains(keyword)) {
                student.displayData();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy kết quả phù hợp.");
        }
    }

    public void sortStudents(Scanner scanner) {
        System.out.println("1. Sắp xếp theo tên (A-Z)");
        System.out.println("2. Sắp xếp theo tên (Z-A)");
        System.out.println("3. Sắp xếp theo GPA tăng dần");
        System.out.println("4. Sắp xếp theo GPA giảm dần");
        System.out.print("Chọn kiểu sắp xếp: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                studentList.sort(Comparator.comparing(Student::getStudentName));
                break;
            case 2:
                studentList.sort(Comparator.comparing(Student::getStudentName).reversed());
                break;
            case 3:
                studentList.sort(Comparator.comparingDouble(Student::getGpa));
                break;
            case 4:
                studentList.sort(Comparator.comparingDouble(Student::getGpa).reversed());
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }
        System.out.println("Danh sách sau khi sắp xếp:");
        displayStudents();
    }
}
