package ss11TruuTuong.B10;

public class Manager extends Employee implements AttendMeeting{
    Manager(String name, double salary){
        super(name, salary);
    }
    @Override
    public void work(){
        System.out.println("Quản lý: " + this.name +", lương: " + this.salary+ "đang giám sát dự án");
    }
    @Override
    public void takeVacation(){
        System.out.println("Quản lý: " + this.name +", lương: " + this.salary+ "đang đi nghỉ phép tại Pháp");
    }
    @Override
    public void attendMeeting() {
        System.out.println("Quản lý: " + this.name +", lương: " + this.salary+ "đang tham gia cuộc họp");
    }
}
