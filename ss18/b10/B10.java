package ss18.b10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B10 {
    public static final Map<Integer,Employee> employees = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employees.put(1, new Employee("NVA", 20));
        employees.put(2, new Employee("NVB", 30));
        employees.put(3, new Employee("NVC", 40));
        while (true){
            System.out.println("-----------MENU-------------");
            System.out.println("1. thêm");
            System.out.println("2. hiển thị");
            System.out.println("3. tính tổng lương của tất cả nhân viên");
            System.out.println("4. tính lương trung bình");
            System.out.println("5. tìm nhân viên lương cao nhất");
            System.out.println("6. tìm nhân viên lương thấp nhất");
            System.out.println("7. thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Employee employee = new Employee();
                    employee.add(sc);
                    employees.put(employee.getId(), employee);
                    break;
                case 2:
                    if(employees.size() == 0){
                        System.out.println("danh sách rỗng");
                        break;
                    }
                    for(Map.Entry<Integer,Employee> entry : employees.entrySet()){
                        entry.getValue().print();
                    }
                    break;
                case 3:
                    double sum = 0;
                    for(Map.Entry<Integer,Employee> entry : employees.entrySet()){
                        sum += entry.getValue().getSalary();
                    }
                    System.out.println("Tổng lương tất cả của nhân viên: "+sum);
                    break;
                case 4:
                    double avg =0;
                    for(Map.Entry<Integer,Employee> entry : employees.entrySet()){
                        avg += entry.getValue().getSalary();
                    }
                    System.out.println("lương trung bình: "+avg/employees.size());
                    break;
                case 5:
                    double max=employees.get(1).getSalary();
                    for(Map.Entry<Integer,Employee> entry : employees.entrySet()){
                        if(entry.getValue().getSalary() > max){
                            max = entry.getValue().getSalary();
                        }
                    }
                    System.out.print("Người có lương cao nhất: ");
                    for(Map.Entry<Integer,Employee> entry : employees.entrySet()){
                        if(entry.getValue().getSalary() == max){
                            employees.get(entry.getKey()).print();
                        }
                    }
                    break;
                case 6:
                    double min=employees.get(1).getSalary();
                    for(Map.Entry<Integer,Employee> entry : employees.entrySet()){
                        if(entry.getValue().getSalary() < min){
                            min = entry.getValue().getSalary();
                        }
                    }
                    System.out.print("Người có lương thấp nhất: ");
                    for(Map.Entry<Integer,Employee> entry : employees.entrySet()){
                        if(entry.getValue().getSalary() == min){
                            employees.get(entry.getKey()).print();
                        }
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Chọn từ 1-7");
                    break;
            }
        }
    }
}