package ss17.deHackathon1.presentation;

import ss17.deHackathon1.bussiness.StudentBusiness;

import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentBusiness studentBusiness = new StudentBusiness();
        while (true) {
            System.out.println("----------------------------Student Menu----------------------------");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Tìm kiếm sinh viên");
            System.out.println("6. Sắp xếp");
            System.out.println("0. Thoát chương trình");
            System.out.println("--------------------------------------------------------------------");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentBusiness.displayStudents();
                    break;
                case 2:
                    studentBusiness.addStudents(scanner);
                    break;
                case 3:
                    studentBusiness.editStudent(scanner);
                    break;
                case 4:
                    studentBusiness.deleteStudent(scanner);
                    break;
                case 5:
                    studentBusiness.searchStudent(scanner);
                    break;
                case 6:
                    studentBusiness.sortStudents(scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        }
    }
}
