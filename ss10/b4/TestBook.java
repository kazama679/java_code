package ss10.b4;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Book1");
        book.setAuthor("Author1");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        book.setPrice(-1);
        System.out.println(book.getPrice());
    }
}
