package ss21.baiHackathon.entity;

import java.util.Optional;
import java.util.Scanner;

public class Customer implements IApp {
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

    public Customer() {
        this.id = ++idAuto;
    }

    public Customer(String name, Optional<String> email) {
        this.id = ++idAuto;
        this.name = name;
        this.email = email;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập tên khách hàng: ");
        this.name = scanner.nextLine();
        System.out.println("Nhập email khách hàng: ");
        String inputEmail = scanner.nextLine().trim();
        this.email = inputEmail.isEmpty() ? Optional.empty() : Optional.of(inputEmail);
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", email=" + email.orElse("Không có email");
    }
}
