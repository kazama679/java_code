package business.model;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private boolean status;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Student() {
    }

    public Student(int age, int id, String name, boolean status) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public void inputData(Scanner sc) {
        System.out.println("Nhap vao nam: ");
        this.name = sc.nextLine();
        System.out.println("Nhap vao age: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao status: ");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }

    public String toString() {
        return "id=" + id + ", name=" + name + ", status=" + status;
    }
}
