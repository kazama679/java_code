package ss19.default_static_mothod;

import java.util.Scanner;

public class Teacher implements IApplication{
    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập thông tin cho giảng viên");
    }

    @Override
    public void displayData() {
        System.out.println("hiển thị thông tin giảng viên");
    }
    @Override
    public void sayHello(String name){
        System.out.println("chào em"+ name);
    }
}
