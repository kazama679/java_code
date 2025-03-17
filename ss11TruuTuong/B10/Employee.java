package ss11TruuTuong.B10;

public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();
    abstract void takeVacation();
}