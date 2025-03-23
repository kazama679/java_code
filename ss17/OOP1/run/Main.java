package ss17.OOP1.run;

import ss17.OOP1.entity.Book;
import ss17.OOP1.validate.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final List<Book> books = new ArrayList<Book>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        books.add(new Book("Tác giả1", "B001", "Tên sách1", 12000, 10000, 2000));
        books.add(new Book("Tác giả2", "B002", "Tên sách2", 15000, 10000, 2001));
        books.add(new Book("Tác giả2", "B003", "Tên sách3", 11000, 10000, 2001));
        books.add(new Book("Tác giả2", "B003", "Tên sách3", 11000, 10000, 2003));

        while(true) {
            System.out.print("----------------------------MENU----------------------------\n" +
                    "1. Nhập thông tin n sách (n nhập từ bàn phím)\n" +
                    "2. Tính lợi nhuận luận các sách\n" +
                    "3. Hiển thị thông tin sách\n" +
                    "4. Sắp xếp sách theo giá bán tăng dần\n" +
                    "5. Sắp xếp sách theo lợi nhuận giảm dần\n" +
                    "6. Tìm sách theo tên sách (tên sách nhập từ bàn phím)\n" +
                    "7. Thống kê số lượng sách theo năm xuất bảnn\n"+
                    "8. Thống kê số lượng sách theo tác giả\n"+
                    "9. Thoát\n"+
                    "Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    printInterest();
                    break;
                case 3:
                    displayBooks();
                    break;
                case 4:
                    orderByPrice();
                    break;
                case 5:
                    orderByInterest();
                    break;
                case 6:
                    searchName(scanner);
                    break;
                case 7:
                    printBookOfYear();
                    break;
                case 8:
                    printBookOfAuthor();
                    break;
                case 9:
                    System.out.println("Thoát!");
                    System.exit(0);
                default:
                    System.out.println("Nhập từ 1-9");
                    break;
            }
        }
    }

    public static void displayBooks(){
        if(books.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }
        for(Book book : books) {
            book.printBooks();
        }
    }
    public static void addBook(Scanner scanner) {
        System.out.println("Nhập n sách muốn thêm: ");
        int n = Validator.validateInt(scanner, 1);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sách thứ " + (i + 1) + ":");
            Book book = new Book();
            book.addBook(scanner);
            books.add(book);
        }
    }

    public static void printInterest(){
        for (Book book : books) {
            System.out.println("Sách: "+book.getBookName()+ " có lợi nhuận là: "+book.countInterest());
        }
    }

    public static void orderByPrice(){
        for (int i = 0; i < books.size(); i++) {
            for (int j = i + 1; j < books.size(); j++) {
                if(books.get(i).getExportPrice() > books.get(j).getExportPrice()){
                    Book temp = books.get(i);
                    books.set(i, books.get(j));
                    books.set(j, temp);
                }
            }
        }
        System.out.println("Sắp xếp sách theo giá bán tăng dần: ");
        displayBooks();
    }
    public static void orderByInterest(){
        for (int i = 0; i < books.size(); i++) {
            for (int j = i + 1; j < books.size(); j++) {
                if(books.get(i).getInterest() < books.get(j).getInterest()){
                    Book temp = books.get(i);
                    books.set(i, books.get(j));
                    books.set(j, temp);
                }
            }
        }
        System.out.println("Sắp xếp sách theo lợi nhuận giảm dần: ");
        displayBooks();
    }

    public static void searchName(Scanner scanner) {
        System.out.println("Nhập tên sách muốn tìm: ");
        String input = scanner.nextLine();
        boolean found = false;
        for (Book book : books) {
            if(book.getBookName().toLowerCase().contains(input.toLowerCase())){
                book.printBooks();
                found = true;
            }
        }
        if(!found){
            System.out.println("K tìm thấy sách!");
        }
    };
    public static void printBookOfYear(){
        ArrayList<Integer> years = new ArrayList<>();
        for (Book book : Main.books) {
            int year = book.getYear();
            if (!years.contains(year)) {
                years.add(year);
            }
        }
        System.out.println("Danh sách thống kê sách theo năm.");
        for (int year : years) {
            int count = 0;
            for (Book book : Main.books) {
                if (book.getYear() == year) {
                    count++;
                }
            }
            System.out.println("Năm " + year + " có " + count + " sách");
        }
    };

    public static void printBookOfAuthor(){
        ArrayList<String> authors = new ArrayList<>();
        for(Book book : Main.books){
            String author = book.getAuthor();
            if(!authors.contains(author)){
                authors.add(author);
            }
        }
        System.out.println("Danh sách thống kê sách theo tác giả.");
        for (String author : authors) {
            int count = 0;
            for (Book book : Main.books) {
                if (book.getAuthor().equals(author)) {
                    count++;
                }
            }
            System.out.println("Tác giả "+author+" có "+count+ " sách");
        }
    };
}
