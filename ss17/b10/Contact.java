package ss17.b10;

import ss17.b9.Book;

import java.util.Objects;

public class Contact {
    public static int idAuto=0;
    public int id;
    public String name;
    public String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.id = ++idAuto;
        this.name = name;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact() {
        this.id = ++idAuto;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        return Objects.equals(phoneNumber, contact.phoneNumber);
    }

    public int hashCode(){
        return Objects.hash(phoneNumber);
    }
    public String toString() {
        return "id: " + id + ", tên: " + name + ", số: " + phoneNumber;
    }
}
