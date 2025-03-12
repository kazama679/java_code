package ss9.b2;

public class Employee {
    private String id;
    private String name;
    private String department;
    private int salary;

    public Employee(String id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.printf("Id: %s%n", this.id);
        System.out.printf("Tên: %s%n", this.name);
        System.out.printf("Vị trí: %s%n", this.department);
        System.out.printf("Lương: %d%n", this.salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        this.salary += (int)(this.salary * (percentage / 100));
    }
}
