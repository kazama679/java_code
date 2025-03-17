package ss12Dahinh.b6;

public class PartTimeEmployee extends Employee{
    private int workHours;
    public PartTimeEmployee(String name, int age, double basicSalary, int workHours) {
        super(name, age, basicSalary);
        this.workHours = workHours;
    }
    @Override
    public double calculateSalary() {
        return basicSalary * workHours;
    }
    @Override
    public void showInfo() {
        System.out.println("Nhân viên bán thời gian: " + name + ", Tuổi: " + age + ", Lương theo giờ: $" + basicSalary + ", Số giờ làm: " + workHours + ", Tổng lương: $" + calculateSalary());
    }
}
