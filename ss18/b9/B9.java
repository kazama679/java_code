package ss18.b9;

import ss9.ra.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B9 {
    public static final Map<Integer, Product> productsMap = new HashMap<>();
    public static void main(String[] args) {
        productsMap.put(1, new Product(1, "Điện thoại", 10.0, 3));
        productsMap.put(2, new Product(2, "Laptop", 20.0, 4));
        productsMap.put(3, new Product(3, "Bàn", 5.0, 5));
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("----------MENU----------------");
            System.out.println("1. Add Student");
            System.out.println("2. edit Student");
            System.out.println("3. xóa Student");
            System.out.println("4. tính tổng");
            System.out.println("5. thoát");
            System.out.println("6. in");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Product product = new Product();
                    product.addProduct(scanner);
                    productsMap.put(product.getId(), product);
                    break;
                case 2:
                    System.out.println("Nhập id cần sửa");
                    int id = Integer.parseInt(scanner.nextLine());
                    int idMap=-1;
                    for (Map.Entry<Integer, Product> entry : productsMap.entrySet()) {
                        if (entry.getKey() == id) {
                            idMap=entry.getKey();
                            break;
                        }
                    }
                    if(idMap==-1){
                        System.out.println("K tìm thấy");
                        break;
                    }
                    System.out.print("name sửa: ");
                    String name = scanner.nextLine();
                    System.out.print("price sửa: ");
                    double price;
                    while(true) {
                        price = Double.parseDouble(scanner.nextLine());
                        if(price > 0) {
                            break;
                        }
                        System.out.println("Gía k đc nhỏ hơn 0, nhập lại");
                    }
                    System.out.print("quantity sửa: ");
                    int quantity;
                    while(true) {
                        quantity = Integer.parseInt(scanner.nextLine());
                        if(quantity > 0) {
                            break;
                        }
                        System.out.println("Số lượng k đc nhỏ hơn 0, nhập lại");
                    }
                    Product pro = new Product(idMap, name, price, quantity);
                    productsMap.put(idMap, pro);
                    break;
                case 3:
                    System.out.println("Nhập id cần xóa");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    int idMapDelete=-1;
                    for (Map.Entry<Integer, Product> entry : productsMap.entrySet()) {
                        if (entry.getKey() == idDelete) {
                            idMapDelete=entry.getKey();
                            break;
                        }
                    }
                    if(idMapDelete==-1){
                        System.out.println("K tìm thấy");
                        break;
                    }
                    productsMap.remove(idMapDelete);
                    break;
                case 4:
                    double total=0;
                    for (Map.Entry<Integer, Product> entry : productsMap.entrySet()) {
                        total += entry.getValue().getPrice() *entry.getValue().getQuantity();
                    }
                    System.out.println("Tổng giá trị khu: "+total);
                    break;
                case 6:
                    for (Map.Entry<Integer, Product> entry : productsMap.entrySet()) {
                        entry.getValue().print();
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Nhập từ 1-5");
                    break;
            }
        }
    }
}
