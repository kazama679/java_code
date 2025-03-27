package ss20.b3;

import java.util.Optional;

public class User {
    private String name;
    private Optional<String> phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getPhone() {
        return phone;
    }

    public void setPhone(Optional<String> phone) {
        this.phone = phone;
    }

    public User(String name, String phone) {
        this.name = name;
        this.phone = Optional.ofNullable(phone);
    }

    public User() {
    }

    public void printInfo(){
        System.out.println("Tên: "+name+" Phone: "+phone.orElse("K có"));
    }
}
