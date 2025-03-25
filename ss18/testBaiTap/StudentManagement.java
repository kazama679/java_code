package ss18.testBaiTap;

import ss18.b10.Employee;

import java.util.*;

public class StudentManagement {
    public static final Map<String,Student> studentTreeMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        studentTreeMap.put("SV001", new Student(20, 8, "SV001", "Nguyễn Xuân Quang"));
        studentTreeMap.put("SV002", new Student(20, 5, "SV002", "Nguyễn Xuân Quang2"));
        studentTreeMap.put("SV003", new Student(20, 9, "SV003", "Nguyễn Xuân Quang3"));
        while (true){
            System.out.println("1. Danh sách sinh viên\n" +
                    "2. Thêm mới các sinh viên\n" +
                    "3. Xóa sinh viên theo mã sinh viên\n" +
                    "4. Tính điểm trung bình của tất cả sinh viên\n" +
                    "5. In thông tin sinh viên có điểm trung bình lớn ớn nhất\n" +
                    "6. In thông tin sinh viên có tuổi nhỏ nhất\n" +
                    "7. Thoát\n" +
                    "Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    printStudent();
                    break;
                case 2:
                    Student student = new Student();
                    student.inputData(scanner);
                    studentTreeMap.put(student.getId(), student);
                    break;
                case 3:
                    System.out.println("Nhập vào id sinh viên cần xóa: ");
                    String id = scanner.nextLine();
                    boolean check = false;
                    for(Map.Entry<String,Student> entry : studentTreeMap.entrySet()){
                        if(entry.getValue().getId().equals(id)){
                            check = true;
                            break;
                        }
                    }
                    if(!check){
                        System.out.println("K tìm thấy");
                        break;
                    }
                    studentTreeMap.remove(id);
                    break;
                case 4:
                    float avg=0;
                    for(Map.Entry<String, Student> entry : studentTreeMap.entrySet()){
                        avg+=entry.getValue().getAverage();
                    }
                    System.out.println("Điểm trung bình của tất cả sv: "+(avg/studentTreeMap.size()));
                    break;
                case 5:
                    float max=-1;
                    for(Map.Entry<String, Student> entry : studentTreeMap.entrySet()){
                        if(entry.getValue().getAverage() > max){
                            max = entry.getValue().getAverage();
                        }
                    }
                    if(max == -1){
                        System.out.println("rỗng");
                        break;
                    }
                    for(Map.Entry<String, Student> entry : studentTreeMap.entrySet()){
                        if(entry.getValue().getAverage() == max){
                            System.out.println("Sv có điểm trung bình cao nhất: "+entry.getValue().toString());
                        }
                    }
                    break;
                case 6:
                    float min=10;
                    for(Map.Entry<String, Student> entry : studentTreeMap.entrySet()){
                        if(entry.getValue().getAverage() < min){
                            min = entry.getValue().getAverage();
                        }
                    }
                    for(Map.Entry<String, Student> entry : studentTreeMap.entrySet()){
                        if(entry.getValue().getAverage() == min){
                            System.out.println("Sv có điểm trung bình thấp nhất: "+entry.getValue().toString());
                        }
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("chọn từ 1-7");
                    break;
            }
        }
    }
    public static void printStudent(){
        if(studentTreeMap.isEmpty()){
            System.out.println("rỗng");
            return;
        }
        for (Map.Entry<String,Student> entry : studentTreeMap.entrySet()){
            System.out.println(entry.getValue().toString());
        }
    }
}
