package ss19.default_static_mothod;

import java.util.Scanner;

public class Student implements IApplication{
    @Override
    public void inputData(Scanner scanner) {
        System.out.println("nhập thông tin sinh viên");
    }

    @Override
    public void displayData() {
        System.out.println("In ra thông tin sinh viên");
    }
}
