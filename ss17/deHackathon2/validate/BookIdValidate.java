package ss17.deHackathon2.validate;

import ss17.deHackathon2.presentation.BookApplication;

import java.util.Scanner;

public class BookIdValidate {
    public static String validateStringId(Scanner sc, String bookId) {
        while (true){
            boolean check = false;
            for (int i=0; i< BookApplication.currentIndex; i++){
                if(bookId.equals(BookApplication.books[i].getBookId())){
                    check=true;
                    break;
                }
            }
            if(bookId.matches("B\\d{5}$") && !check){
                return bookId;
            }
            System.out.println("Id book k hợp lệ, nhập lại");
            bookId = sc.nextLine();
        }
    }
}
