package ss21.LibraryManagement.entity;

import ss21.LibraryManagement.presentation.LibraryManagement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Book implements IApp{
    private String id;
    private String name;
    private String author;
    private int quantity;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book(String author, String id, String name, int quantity) {
        this.author = author;
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Book() {
    }

    @Override
    public void inputData(Scanner scanner) {
        while (true){
            System.out.println("Nhập id sách: ");
            String inputId = scanner.nextLine();
            if(!inputId.matches("^B\\w{4}$")){
                System.out.println("Id k hợp lệ");
                continue;
            }
            boolean check = false;
            for (Book book:LibraryManagement.listBooks){
                if(book.getId().equals(inputId)){
                    check = true;
                }
            }
            if(!check){
                this.id = inputId;
                break;
            }
            System.out.println("Id trùng");
        }
        while(true){
            System.out.println("nhập vào tên sách: ");
            String inputName = scanner.nextLine();
            if(inputName.length()<10 || inputName.length()>100){
                System.out.println("tên sách k hợp lệ");
                continue;
            }
            boolean check = false;
            for (Book book:LibraryManagement.listBooks){
                if(book.getName().equals(inputName)){
                    check = true;
                }
            }
            if(!check){
                this.name = inputName;
                break;
            }
            System.out.println("Tên sách trùng");
        }
        System.out.println("Nhập vào tên tác giả: ");
        this.author = scanner.nextLine();
        while (true){
            try {
                System.out.println("Nhập vào số lượng sách: ");
                int n = Integer.parseInt(scanner.nextLine());
                if(n>0){
                    this.quantity = n;
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("Số lượng k hợp lệ, nhập lại");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public String toString(){
        return "Id: "+id+ ", Name: "+name+ ", Author: "+author+ ", Quantity: "+quantity;
    }
}
