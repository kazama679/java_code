package ss22.b9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B9 {
    public static final List<Book> books = new ArrayList<Book>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        books.add(new Book("Tác giả1", "Tên sách1", 12, "NSX"));
        books.add(new Book("Tác giả2", "Tên sách2", 12, "NSX"));
        books.add(new Book("Tác giả3", "Tên sách3", 12, "NSX"));
        writeToFile(books);
        while (true){
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. In");
            System.out.println("5. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    BookManager.addBook(scanner);
                    break;
                case 2:
                    BookManager.updateBook(scanner);
                    break;
                case 3:
                    BookManager.deleteBook(scanner);
                    break;
                case 4:
                    BookManager.displayAllBooks();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Nhập từ1-5");
                    break;
            }
        }
    }

    public static void writeToFile(List<Book> listBooks) {
        File file = new File("b9.txt");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listBooks);
            oos.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void readFromFile() {
        File file = new File("b9.txt");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            List<Book> listBooks = (List<Book>) ois.readObject();
            listBooks.forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
