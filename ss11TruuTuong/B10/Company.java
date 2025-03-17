package ss11TruuTuong.B10;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;
    public Company() {
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Đã thêm nhân viên: " + employee.name);
    }

    public void startWorkDay() {
        for (Employee e : employees) {
            e.work();
        }
    }

    public void organizeMeeting() {
        for (Employee e : employees) {
            if (e instanceof AttendMeeting) {
                ((AttendMeeting) e).attendMeeting();
            }
        }
    }

    public void startVacation() {
        for (Employee e : employees) {
            e.takeVacation();
        }
    }
}