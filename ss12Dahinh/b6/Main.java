package ss12Dahinh.b6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new FullTimeEmployee("NVA", 21, 3000, 500);
        employees[1] = new PartTimeEmployee("NVB", 22, 15, 150);
        employees[2] = new Intern("NVC", 23, 1000);
        for (Employee emp : employees) {
            emp.showInfo();
            System.out.println();
        }
    }
}
