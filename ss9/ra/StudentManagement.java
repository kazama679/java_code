package ss9.ra;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        //Khới tạo đối tượng: ClassName objName = new Constructor(Arguments)
        //1. Khởi tạo đối tượng sinh viên 1 với các thông tin mặc định
        Student student1 = new Student();
        //2. Khởi tạo đối tượng sinh viên 2 với các thông tin Mã sinh viên là SV002, tên SV: Nguyễn Văn B
        Student student2 = new Student("SV002", "Nguyễn Văn B");
        //3. Khới tạo đối tượng sinh viên 3 với các thông tin: SV003, Nguyễn Văn C, 23, true, Hồ Chí Minh
        Student student3 = new Student("SV003", "Nguyễn Văn C", 23, true, "Hồ Chí Minh");
        //4. Nhập thông tin sinh viên 1
        System.out.println("***************NHẬP THÔNG TIN SINH VIÊN 1***********************");
        Scanner scanner = new Scanner(System.in);
        student1.inputData(scanner);
        //5. Sử dụng các phương thức setter để nhập các thông tin còn lại của sinh viên 2
        System.out.println("***************NHẬP THÔNG TIN SINH VIÊN 2***********************");
        System.out.println("Nhập vào tuổi sinh viên:");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào giới tính sinh viên:");
        student2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập vào địa chỉ sinh viên:");
        student2.setAddress(scanner.nextLine());
        //6. Cho sinh viên 3 tính tổng 2 số nguyên 10 và 20 và in ra màn hình console
        System.out.println("Kết quả: " + student3.addTwoNumbers(10, 20));
        //7. Tính tuổi trung bình của 3 sinh viên và in ra kết quả - GETTER
        int avgAge = (student1.getAge() + student2.getAge() + student3.getAge()) / 3;
        System.out.println("Tuổi trung bình: " + avgAge);
        //In thông tin sinh viên
        System.out.println("***************THÔNG TIN SINH VIÊN 1******************");
        student1.displayData();
        System.out.println("***************THÔNG TIN SINH VIÊN 2******************");
        student2.displayData();
        System.out.println("***************THÔNG TIN SINH VIÊN 3******************");
        student3.displayData();
    }
}