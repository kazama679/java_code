package ss19.default_static_mothod;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        student.sayHello("Đẳng cấp thợ thầy");
        Teacher teacher = new Teacher();
        teacher.sayHello("Quang");

        System.out.println("tổng 2 số 10 và 20 là: "+IApplication.addTwoNumbers(10,20));
    }
}
