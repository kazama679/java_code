package ss9.b2;

public class B2{
    public static void main(String[] args) {
        Employee employee1 = new Employee("ID001", "Nguyễn Văn A", "Kế Toán", 10000000);
        // in
        employee1.displayInfo();
        // tăng lương
        employee1.increaseSalary(15);
    }
}
