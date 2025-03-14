package ss10.b9;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Nguyễn Văn A", "E001", 5000);
        employees[1] = new Manager("Nguyễn Văn B", "M001", 7000, 2000);
        employees[2] = new Developer("Nguyễn Văn C", "D001", 6000, "Java");

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        employees[0].increaseSalary(500);
        System.out.println("\nSau khi tăng lương:");
        System.out.println(employees[0]);
    }
}