package ss17.deHackathon1.entity;

import ss17.deHackathon1.entity.IApp;
import ss17.deHackathon1.validate.Validator;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Student implements IApp {
    private static int counter = 10000;
    private static Set<String> emailSet = new HashSet<>();
    private String studentId;
    private String studentName;
    private String birthday;
    private String phoneNumber;
    private boolean sex;
    private String email;
    private String major;
    private String className;
    private float gpa;
    private byte status = 1; // Mặc định là 1 - Đang theo học

    public Student() {
        this.studentId = generateStudentId();
    }

    private String generateStudentId() {
        return "SV" + counter++;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public byte getStatus() {
        return status;
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.print("Nhập tên sinh viên: ");
        this.studentName = Validator.validateString(sc, 1, 50);

        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        this.birthday = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        this.phoneNumber = Validator.validatePhone(sc);

        System.out.print("Nhập giới tính (true - Nam, false - Nữ): ");
        this.sex = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Nhập email: ");
        this.email = Validator.validateEmail(sc);

        System.out.print("Nhập ngành học: ");
        this.major = Validator.validateString(sc, 1, 50);

        System.out.print("Nhập tên lớp: ");
        this.className = Validator.validateString(sc, 1, 20);

        System.out.print("Nhập GPA: ");
        this.gpa = Validator.validateFloat(sc, 0.0f);
    }

    @Override
    public void displayData() {
        String gender = this.sex ? "Nam" : "Nữ";
        String statusText = switch (this.status) {
            case 1 -> "Đang theo học";
            case 2 -> "Bảo lưu";
            case 3 -> "Đã nghỉ học";
            default -> "Không xác định";
        };

        System.out.println("Mã sinh viên: " + this.studentId);
        System.out.println("Tên sinh viên: " + this.studentName);
        System.out.println("Ngày sinh: " + this.birthday);
        System.out.println("Giới tính: " + gender);
        System.out.println("Số điện thoại: " + this.phoneNumber);
        System.out.println("Tên lớp: " + this.className);
        System.out.println("Trạng thái: " + statusText);
    }
}