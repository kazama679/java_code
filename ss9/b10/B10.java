package ss9.b10;

import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student10[] studentList = new Student10[100];
        int studentCount = 0;
        while (true) {
            System.out.println("\n===== HỆ THỐNG QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Thêm sinh viên mới");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Vui lòng chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    if (studentCount == 0) {
                        System.out.println("Danh sách sinh viên đang trống. Hãy thêm sinh viên mới!");
                    } else {
                        System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
                        for (int i = 0; i < studentCount; i++) {
                            System.out.println("\nSinh viên #" + (i + 1) + ":");
                            studentList[i].displayData();
                        }
                    }
                    break;
                case 2:
                    if (studentCount >= 100) {
                        System.out.println("Danh sách đã đầy, không thể thêm sinh viên mới.");
                        break;
                    }
                    Student10 newStudent = new Student10();
                    newStudent.inputData(scanner);
                    studentList[studentCount] = newStudent;
                    studentCount++;
                    System.out.println("Thêm sinh viên thành công!");
                    break;
                case 3:
                    System.out.print("Nhập mã sinh viên cần chỉnh sửa: ");
                    int editId = Integer.parseInt(scanner.nextLine());
                    boolean foundEdit = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (studentList[i].getId() == editId) {
                            System.out.println("Nhập thông tin mới cho sinh viên có mã " + editId + ":");
                            studentList[i].inputData(scanner);
                            foundEdit = true;
                            System.out.println("Cập nhật thông tin thành công!");
                            break;
                        }
                    }
                    if (!foundEdit) {
                        System.out.println("Không tìm thấy sinh viên với mã: " + editId);
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean foundDelete = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (studentList[i].getId() == deleteId) {
                            foundDelete = true;
                            for (int j = i; j < studentCount - 1; j++) {
                                studentList[j] = studentList[j + 1];
                            }
                            studentList[studentCount - 1] = null;
                            studentCount--;
                            System.out.println("Xóa sinh viên thành công!");
                            break;
                        }
                    }
                    if (!foundDelete) {
                        System.out.println("Không tìm thấy sinh viên với mã: " + deleteId);
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình. Hẹn gặp lại!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập từ 1 đến 5.");
            }
        }
    }
}