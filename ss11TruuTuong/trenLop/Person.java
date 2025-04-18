package ss11TruuTuong.trenLop;

import java.util.Scanner;

// Lớp trừu tượng
public abstract class Person {
    private String name;
    private int age;
    private boolean sex;
    public Person(){};

    public Person(int age, String name, boolean sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void printPerson(){
        System.out.println("In thông tin person");
    }

    public void inputData(Scanner sc){
        System.out.println("Nhập thông tin person");
    }

    public abstract int addTwoNumbers(int firstNumber, int secondNumber);
    public abstract void hello();

}
