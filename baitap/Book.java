package ss9.baitap;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Book {
    private String bookId;
    private String bookName;
    private double importPrice;
    private double exportPrice;
    private String title;
    private String author;
    private int interest;
    private int year;
    public Book(){};

    public Book(String bookId, String bookName, double importPrice, double exportPrice, String title, String author, int interest, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.title = title;
        this.author = author;
        this.interest = interest;
        this.year = year;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void inputData(Scanner scanner){
        System.out.println("Nhập vào id sách:");
        String idRegex = "B\\d{4}";
        do {
            this.bookId = scanner.nextLine();
            if (Pattern.matches(idRegex, this.bookId)) {
                break;
            } else {
                System.err.println("Định dạng id buộc bắt đầu bằng chứ B");
            }
        } while (true);
        System.out.println("Nhập vào tên sách:");
        do {
            this.bookName = scanner.nextLine();
            if (this.bookName.length()>=6 && this.bookName.length()<=100) {
                break;
            } else {
                System.err.println("Tên sách p có từ 6 - 100 kí tự");
            }
        } while (true);
        System.out.println("Nhập vào giá nhập sách:");
        while(true){
            this.importPrice = scanner.nextDouble();
            if (this.importPrice>0) {
                break;
            } else {
                System.err.println("Giá nhập sách p lớn hơn 0");
            }
        }
        System.out.println("Nhập vào giá bán sách:");
        while(true){
            this.exportPrice = scanner.nextDouble();
            scanner.nextLine();
            if (this.exportPrice>=this.importPrice*1.1) {
                break;
            } else {
                System.err.println("Giá nhập bán p lớn hơn giá nhập 10%");
            }
        }
        System.out.println("Nhập vào tiêu đề sách:");
        while(true){
            this.title = scanner.nextLine();
            if (this.title.isEmpty()) {
                System.out.println("Bắt buộc p nhập tiêu đề");
            }else{
                break;
            }
        }
        System.out.println("Nhập vào tác giả của sách:");
        while(true){
            this.author = scanner.nextLine();
            if (this.author.isEmpty()) {
                System.out.println("Bắt buộc p nhập tác giả");
            }else{
                break;
            }
        }
        System.out.println("Nhập vào năm sản xuất sách:");
        int currentYear = LocalDate.now().getYear();

        while(true){
            this.year = scanner.nextInt();
            scanner.nextLine();
            if(this.year > 1970 && this.year<=currentYear) {
                break;
            }else{
                System.out.println("Vui lòng nhập năm sau 1970 và <= năm hiện tại");
            }
        }
    }

    public void displayData(){
        System.out.println("\nMã sách: "+this.bookId);
        System.out.println("Tên sách: "+this.bookName);
        System.out.println("Gía nhập: "+this.importPrice);
        System.out.println("Gía bán: "+this.exportPrice);
        System.out.println("Tiêu đề sách: "+this.title);
        System.out.println("Tác giả: "+this.author);
        System.out.println("Lợi nhuận: "+ calInterest());
        System.out.println("Năm sản xuất: "+this.year);
    }

    public double calInterest(){
        return (this.exportPrice - this.importPrice);
    }
}
