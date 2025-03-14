package ss10.b9;

public class Manager extends Employee{
    private double bonus;
    public Manager() {}

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Thưởng: " + bonus;
    }
}