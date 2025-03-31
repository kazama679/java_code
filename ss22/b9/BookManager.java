package ss22.b9;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BookManager {
    public static void addBook(Scanner scanner){
        Book book = new Book();
        book.addBook(scanner);
        B9.books.add(book);
        B9.writeToFile(B9.books);
    }
    public static void updateBook(Scanner scanner){
        System.out.println("Nhập vào id sách: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = IntStream.range(0, B9.books.size()).filter(i->B9.books.get(i).getId()==id).findFirst().orElse(-1);
        if(index == -1){
            System.out.println("K tìm thấy sách");
            return;
        }
        System.out.println("Nhập vào tên sách: ");
        B9.books.get(index).setName(scanner.nextLine());
        System.out.println("Nhập vào tên tác giả: ");
        B9.books.get(index).setAuthor(scanner.nextLine());
        System.out.println("Nhập vào nhà sản xuất");
        B9.books.get(index).setPublisher(scanner.nextLine());
        while (true){
            try {
                System.out.println("Nhập vào giá bán: ");
                double price= Double.parseDouble(scanner.nextLine());
                if(price>0){
                    B9.books.get(index).setPrice(price);
                    break;
                }
                System.out.println("Giá p lớn hơn 0");
            }catch(NumberFormatException e){
                System.out.println("Nhập vào số");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        B9.writeToFile(B9.books);
    }
    public static void deleteBook(Scanner scanner){
        System.out.println("Nhập vào id sách cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = IntStream.range(0, B9.books.size()).filter(i->B9.books.get(i).getId()==id).findFirst().orElse(-1);
        if(index == -1){
            System.out.println("K tìm thấy sách");
            return;
        }
        B9.books.remove(index);
        B9.writeToFile(B9.books);
    }
    public static void displayAllBooks(){
        B9.readFromFile();
    }
}
