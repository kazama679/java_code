package ss25.b1;

public class B1 {
    public static void main(String[] args) {
        Account acc1 = Account.getInstance();
        acc1.setId(1);
        acc1.setName("Nguyen Van A");
        acc1.setAge(25);
        Account acc2 = Account.getInstance();
        System.out.println("acc1 info:");
        acc1.displayInfo();
        System.out.println("acc2 info:");
        acc2.displayInfo();
        if (acc1 == acc2) {
            System.out.println("acc1 và acc2 là cùng một đối tượng");
        } else {
            System.out.println("acc1 và acc2 là các đối tượng khác nhau");
        }
    }
}
