package ss9.b10;
import java.util.Scanner;

public class Student10 {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public enum Gender {
        MALE, FEMALE, OTHER;
    }

    public Student10() {
    }

    public Student10(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void inputData(Scanner sc) {
        System.out.print("Id: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Tên: ");
        this.name = sc.nextLine();
        System.out.print("Tuổi: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.print("Giới tính (MALE, FEMALE, OTHER): ");
        while (true) {
            String genderInput = sc.nextLine().toUpperCase();
            if (genderInput.equals("MALE") || genderInput.equals("FEMALE") || genderInput.equals("OTHER")) {
                this.gender = Gender.valueOf(genderInput);
                break;
            }
            System.out.print("Vui lòng nhập lại (MALE, FEMALE, OTHER): ");
        }
        System.out.print("Địa chỉ: ");
        this.address = sc.nextLine();
        System.out.print("Số điện thoại: ");
        this.phoneNumber = sc.nextLine();
    }

    public void displayData() {
        System.out.println("Id: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phoneNumber);
    }
}