package ss21.LibraryManagement.entity;

import java.util.Optional;
import java.util.Scanner;

public class Member implements IApp{
    private static int idAuto=0;
    private int id;
    private String name;
    private Optional<String> email;

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member() {
        this.id = ++idAuto;
    }

    public Member(String name, Optional<String> email) {
        this.email = email;
        this.id = ++idAuto;
        this.name = name;
    }


    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào tên thành viên: ");
        this.name = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine().trim();
        this.email = email.isEmpty() ? Optional.empty() : Optional.of(email);
    }

    @Override
    public String toString(){
        return "Id: "+id+ ", Name: "+name+ ", Email: "+email.orElse("Chưa có email");
    }
}
