package ss18.testBaiTap;

import java.util.Map;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private float average;

    public Student(int age, float average, String id, String name) {
        this.age = age;
        this.average = average;
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào id: ");
        this.id = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên: ");
        this.name = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên");
        while (true){
            int age = Integer.parseInt(scanner.nextLine());
            if(age >= 0){
                this.age = age;
                break;
            }
            System.out.println("tuổi k đc âm");
        }
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào điểm trung bình");
        while (true){
            float avg = Float.parseFloat(scanner.nextLine());
            if(avg >= 0 && avg <= 10){
                this.average = avg;
                break;
            }
            System.out.println("Điểm phải lớn hơn 0 và nhỏ hơn 10");
        }
    }
    @Override
    public String toString(){
        return "Student: id=" + id + ", name=" + name + ", age=" + age + ", average=" + average;
    }
}