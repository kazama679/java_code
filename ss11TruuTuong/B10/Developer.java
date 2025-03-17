package ss11TruuTuong.B10;

public class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void work() {
        System.out.println("Lập trình viên: " + this.name +", lương: " + this.salary+ "đang viết code cho hệ thống mới");
    }
    @Override
    public void takeVacation() {
        System.out.println("Lập trình viên: " + this.name +", lương: " + this.salary+ "đang đi nghỉ phép ở Bali");
    }
}
