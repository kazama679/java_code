package ss22.b9;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable {
    private static int idAuto=0;
    private int id;
    private String name;
    private String author;
    private String publisher;
    private double price;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Book(String author, String name, double price, String publisher) {
        this.author = author;
        this.id = ++idAuto;
        this.name = name;
        this.price = price;
        this.publisher = publisher;
    }

    public Book() {
        this.id = ++idAuto;
    }

    public String toString() {
        return id + " " + name + " " + author + " " + publisher + " " + price;
    }

    public void addBook(Scanner scanner){
        System.out.println("Nhập vào tên sách: ");
        this.name=scanner.nextLine();
        System.out.println("Nhập vào tên tác giả: ");
        this.author=scanner.nextLine();
        System.out.println("Nhập vào nhà sản xuất");
        this.publisher=scanner.nextLine();
        while (true){
            try {
                System.out.println("Nhập vào giá bán: ");
                double price= Double.parseDouble(scanner.nextLine());
                if(price>0){
                    this.price=price;
                    break;
                }
                System.out.println("Giá p lớn hơn 0");
            }catch(NumberFormatException e){
                System.out.println("Nhập vào số");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
