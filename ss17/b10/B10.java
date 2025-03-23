package ss17.b10;

import ss17.b9.Book;

import java.util.*;

public class B10 {
    public static void main(String[] args) {
        Set<Contact> contact = new HashSet<>();
        addContact(contact, new Contact("Người dùng 1", "0987654321"));
        addContact(contact, new Contact("Người dùng 2", "0987654322"));
        addContact(contact, new Contact("Người dùng 3", "0987654323"));
        addContact(contact, new Contact("Người dùng 3", "0987654323"));

        // xóa
        contact.remove(new Contact("Người dùng 3", "0987654323"));

        // kiểm tra xem có k
        System.out.println(contact.contains(new Contact("Người dùng 2", "0987654322")));
        for (Contact c : contact) {
            System.out.println(c);
        }
    }

    public static void addContact (Set<Contact> contact, Contact c) {
        if(contact.contains(c)) {
            System.out.println("Sdt đã tồn tại");
        }else{
            contact.add(c);
            System.out.println("thêm thành công");
        }
    }
}