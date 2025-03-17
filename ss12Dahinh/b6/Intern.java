package ss12Dahinh.b6;

public class Intern extends Employee{
    public Intern(String name, int age, double basicSalary) {
        super(name, age, basicSalary);
    }
    @Override
    public double calculateSalary() {
        return basicSalary;
    }
    @Override
    public void showInfo() {
        System.out.println("Thực tập sinh: " + name + ", Tuổi: " + age + ", Lương cố định: $" + basicSalary);
    }
}
