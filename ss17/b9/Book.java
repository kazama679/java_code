package ss17.b9;

import java.util.Objects;

public class Book {
    private String id;
    private String title;
    private String author;
    private int year;

    public Book() {
    }

    public Book(String author, String id, String title, int year) {
        this.author = author;
        this.id = id;
        this.title = title;
        this.year = year;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "book Id: " + id + ", tên sách: " + title + ", tác giả: " + author+ ", năm: " + year;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(id, book.id);
    }

    public int hashCode(){
        return Objects.hash(id);
    }
}
