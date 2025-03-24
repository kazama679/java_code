package ss18.b10;

import java.util.Scanner;

public class Employee {
    private static int idAuto=0;
    private int id;
    private String name;
    private double salary;

    public Employee() {
        this.id = ++idAuto;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.id = ++idAuto;
        this.name = name;
        this.salary = salary;
    }
    public void add(Scanner scanner) {
        System.out.println("tên: ");
        this.name = scanner.nextLine();
        System.out.println("price: ");
        while (true){
            double salary = Double.parseDouble(scanner.nextLine());
            if(salary >= 0) {
                this.salary = salary;
                break;
            }
            System.out.println("lương k đc âm, nhập lại");
        }
    }
    public void print(){
        System.out.println("----------------------");
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);
    }
}
