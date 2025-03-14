package ss10.b9;

public class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee() {}

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        } else {
            System.out.println("Số tiền tăng lương không hợp lệ!");
        }
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", ID: " + id + ", Lương: " + salary;
    }
}