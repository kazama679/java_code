package ss17.b9;

import java.util.*;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Book> set = new HashSet<>();
        Book book1 = new Book("B001", "Sách 1", "Tác giả 1", 2000);
        Book book2 = new Book("B002", "Sách 2", "Tác giả 2", 2002);
        Book book3 = new Book("B003", "Sách 3", "Tác giả 3", 2000);
        Book book4 = new Book("B003", "Sách 3", "Tác giả 3", 2000);
        set.add(book1);
        set.add(book2);
        set.add(book3);
        set.add(book4);
        System.out.println("nhập vào năm về sau lấy: ");
        List<Book> books = new ArrayList<>();
        int year = Integer.parseInt(sc.nextLine());
        for (Book book : set) {
            if (book.getYear() > year) {
                books.add(book);
            }
        }
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return -b1.getTitle().compareTo(b2.getTitle());
            }
        });
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
