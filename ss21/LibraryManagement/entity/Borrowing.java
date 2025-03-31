package ss21.LibraryManagement.entity;

import ss21.LibraryManagement.presentation.LibraryManagement;

import java.time.LocalDate;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Borrowing implements IApp{
    private static int idAuto=0;
    private int id;
    private Member member;
//    private BorrowBooks List<Book>;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private Boolean status;

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Borrowing(LocalDate borrowDate, LocalDate dueDate, Member member, Boolean status) {
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.id = ++idAuto;
        this.member = member;
        this.status = status;
    }

    public Borrowing() {
        this.id = ++idAuto;
    }

    @Override
    public void inputData(Scanner scanner) {
        // cách chọn với id
        while (true){
            if(LibraryManagement.listMembers.isEmpty()){
                System.out.println("Danh sách rỗng");
                return;
            }
            LibraryManagement.listMembers.forEach(System.out::println);
            System.out.println("chọn thành viên mượn sách với id: ");
            int option = Integer.parseInt(scanner.nextLine());
            OptionalInt index = IntStream.range(0, LibraryManagement.listMembers.size()).filter(i -> LibraryManagement.listMembers.get(i).getId() == option).findFirst();
            if(index.isPresent()){
                this.member = LibraryManagement.listMembers.get(index.getAsInt());
            }
            System.out.println("Vui lòng chọn đúng mã member");
        }

    }

    @Override
    public String toString(){
        return "tí viết lại";
    }
}
