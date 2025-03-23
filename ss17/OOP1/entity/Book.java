package ss17.OOP1.entity;

import ss17.OOP1.validate.Validator;

import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private float interest;
    private int year;

    public Book() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getInterest() {
        return countInterest();
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String author, String bookId, String bookName, float exportPrice, float importPrice, int year) {
        this.author = author;
        this.bookId = bookId;
        this.bookName = bookName;
        this.exportPrice = exportPrice;
        this.importPrice = importPrice;
        this.interest = countInterest();
        this.year = year;
    }
    public float countInterest(){
        return exportPrice-importPrice;
    }

    public void addBook(Scanner scanner) {
        System.out.println("Nhập vào id sách: ");
        this.bookId = Validator.validateId(scanner);
        System.out.println("Nhập vào tên sách: ");
        String input = Validator.validateString(scanner, 1, 1000);
        this.bookName = Validator.checkSomeName(scanner, input);
        System.out.println("Nhập vào giá nhập sách: ");
        this.importPrice = Validator.validateFloat(scanner, 0);
        System.out.println("Nhập vào giá bán sách: ");
        this.exportPrice = Validator.validateFloat(scanner, importPrice*1.3f);
        System.out.println("Nhập vào tác giả sách: ");
        this.author = Validator.validateString(scanner, 6, 50);
        System.out.println("Nhập vào năm sản xuất: ");
        this.year = Validator.validateInt(scanner, 2000);
    }

    public void printBooks() {
        System.out.println("-------------------------");
        System.out.println("Id: " + bookId);
        System.out.println("tên sách: " + bookName);
        System.out.println("Giá nhập: " + exportPrice);
        System.out.println("Giá bán: " + importPrice);
        System.out.println("Tác giả: " + author);
        System.out.println("Lợi nhuận: " + interest);
        System.out.println("năm: " + year);
    }
}
