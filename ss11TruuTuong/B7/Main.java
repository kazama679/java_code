package ss11TruuTuong.B7;

public class Main {
    public static void main(String[] args) {
        Employee partTime = new PartTimeEmployee("Quang", 10, 2);
        Employee fullTime = new FullTimeEmployee("Quang2", 12);
        System.out.println(partTime.getName() + " Salary: " + partTime.calculateSalary());
        System.out.println(fullTime.getName() + " Salary: " + fullTime.calculateSalary());
    }
}
