package ss17.deHackathon2.entity;

import ss17.deHackathon2.validate.BookIdValidate;
import ss17.deHackathon2.validate.Validator;

import java.util.Scanner;

public class Book implements IApp {
    private String bookId;
    private String bookTitle;
    private String author;
    private String publisher;
    private int publicationYear;
    private String category;
    private double price;
    private int quantity;

    public Book(){
    }

    public Book(String author, String bookId, String bookTitle, String category, double price, int publicationYear, String publisher, int quantity) {
        this.author = author;
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.category = category;
        this.price = price;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào id sách: ");
        String input = Validator.validateString(scanner, 1, 100);
        this.bookId = BookIdValidate.validateStringId(scanner, input);

        System.out.println("Nhập vào tiêu đề sách: ");
        this.bookTitle = Validator.validateString(scanner, 1, 100);

        System.out.println("Nhập vào tác giả sách: ");
        this.author = Validator.validateString(scanner, 1, 50);

        System.out.println("Nhập vào nhà xuất bản sách: ");
        this.publisher = Validator.validateString(scanner, 1, 100);

        System.out.println("Nhập vào năm sản xuất: ");
        this.publicationYear = Validator.validateInt(scanner, 1960);

        System.out.println("Nhập vào danh mục sách: ");
        this.category = Validator.validateString(scanner, 1, 100);

        System.out.println("Nhập vào giá bán sách: ");
        this.price = Validator.validateDouble(scanner, 0);

        System.out.println("Nhập vào số lượng sách: ");
        this.quantity = Validator.validateInt(scanner, 1);
    }

    @Override
    public void displayData() {
        System.out.println("--------------------------------");
        System.out.println("Id: " + bookId);
        System.out.println("Tiêu đề sách: " + bookTitle);
        System.out.println("Tác giả: " + author);
        System.out.println("Nhà xuất bản: " + publisher);
        System.out.println("Năm sản xuất: " + publicationYear);
        System.out.println("Danh mục: " + category);
        System.out.println("Giá bán: " + price);
        System.out.println("Số lượng: " + quantity);
    }
}