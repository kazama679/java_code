package ss20.b7;

public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age, String department, double salary) {
        this.age = age;
        this.department = department;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }
    @Override
    public String toString() {
        return "Tên: " + name + ", " + age + ", " + department + ", " + salary;
    }
}
