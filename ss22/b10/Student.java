package ss22.b10;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private static int idAuto=0;
    private int id;
    private String name;
    private String major;
    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(double gpa, String major, String name) {
        this.gpa = gpa;
        this.id = ++idAuto;
        this.major = major;
        this.name = name;
    }

    public void addStudent(Scanner scanner) {
        System.out.println("Nhập vào tên sv: ");
        this.name = scanner.nextLine();
        System.out.println("Nhập vào tên chuyên ngành: ");
        this.major = scanner.nextLine();
        while (true) {
            try {
                System.out.println("Nhập vào điểm gpa: ");
                double gpa = Double.parseDouble(scanner.nextLine());
                if(gpa>=0){
                    this.gpa = gpa;
                    break;
                }
                System.out.println("GPA k đc âm");
            }catch (NumberFormatException e) {
                System.out.println("K p số");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public Student() {
        this.id = ++idAuto;
    }

    public String toString() {
        return "Id: "+id+" Name: "+name+" Major: "+major+" GPA: "+gpa;
    }
}
