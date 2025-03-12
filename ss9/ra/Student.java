package ss9.ra;

import java.util.Scanner;

public class Student {
    /*
     * Xây dựng lớp Sinh viên quản lý thông tin sinh viên:
     * 1. Các thuộc tính
     *   - Mã sinh viên
     *   - Tên sinh viên
     *   - Tuổi sinh viên
     *   - Giới tính sinh viên
     *   - Địa chỉ SV
     * 2. Có 3 constructors: không tham số, có 2 tham số mã sinh viên - tên sinh viên, có đầy đủ tham số
     * 3. Có các hành vi:
     *   - Tính tổng 2 số nguyên
     *   - Chào giảng viên
     *   - Nhập thông tin sinh viên
     *   - Hiển thị thông tin sinh viên
     * */
    //1. Fields | Properties | Attributes: Thuộc tính mô tả các đặc điểm của đối tượng trong thế giới thực
    //Syntax: private + datatype + attributeName
    private  String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;

    //2. Constructors: các hàm tạo giúp khởi tạo đối tượng từ lớp
    //Syntax: public + ClassName (paramters)
    //-- Constructor default: 0 tham số khởi tạo đối tượng với các thuộc tính với giá trị mặc định
    public Student() {
    }

    //--Constructor 2 tham số khởi tạo đối tượng với mã sinh viên và tên sinh viên
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    //--Constructor đầy đủ tham số để khởi tạo tất cả các thông tin của sinh viên
    public Student(String studentId, String studentName, int age, boolean sex, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }
    //3. Methods mô tả các hành vi của đối tượng
    //Syntax: Access Modifier + ReturnData + MethodName(Parameters){Block Statements}
    //3.1. Getter/Setter
    //Getter: Lấy dữ liệu các thuộc tính
    //Setter: gán giá trị cho các thuộc tính

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //3.2. Method Behavior: phương thức hành vi
    public int addTwoNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public void helloTeacher() {
        System.out.println("Xin chào giảng viên");
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ sinh viên:");
        this.address = scanner.nextLine();
    }

    public void displayData() {
        System.out.printf("Mã SV: %s - Tên SV: %s - Tuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %s - Địa chỉ: %s\n", this.sex ? "Nam" : "Nữ", this.address);
    }
}