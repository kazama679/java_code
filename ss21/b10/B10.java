package ss21.b10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class B10 {
    public static final List<Product> products = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        products.add(new Product("SP001", "Laptop", 20));
        products.add(new Product("SP002", "Điện thoại", 10));
        products.add(new Product("SP003", "Chuột", 5));
        while (true){
            System.out.println("1. Xem danh sách sản phẩm có sẵn");
            System.out.println("2. Thêm sản phẩm vào giỏ hàng");
            System.out.println("3. Xóa sản phẩm khỏi giỏ hàng");
            System.out.println("4. Xem giỏ hàng");
            System.out.println("5. Hiển thị tổng tiền");
            System.out.println("6. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    printPro();
                    break;
                case 2:
                    printPro();
                    if(products.isEmpty()){
                        break;
                    }
                    while(true){
                        System.out.println("Nhập id sản phẩm muốn thêm vào giỏ: ");
                        String id = sc.nextLine();
                        OptionalInt index = IntStream.range(0, products.size()).filter(i->products.get(i).getId().equals(id)).findFirst();
                        if(index.isEmpty()){
                            System.out.println("Vui lòng nhập đúng id");
                            continue;
                        }
                        try {
                            System.out.println("Nhập số lượng: ");
                            int quantity = Integer.parseInt(sc.nextLine());
                            Validator.validNumber(quantity);
                            ShoppingCart.addToCart(products.get(index.getAsInt()), quantity);
                            break;
                        }catch (NumberFormatException e){
                            System.out.println("K phải số");
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    if(ShoppingCart.cartItems.isEmpty()){
                        System.out.println("Danh sách rỗng");
                        break;
                    }
                    System.out.println("Danh sách sản phẩm có trong giỏ: ");
                    ShoppingCart.cartItems.forEach(System.out::println);
                    while(true){
                        System.out.println("Nhập id sản phẩm muốn xóa vào giỏ: ");
                        String id = sc.nextLine();
                        try {
                            Validator.validProduct(id);
                            ShoppingCart.removeFromCart(id);
                        } catch (Validator e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    break;
                case 4:
                    if(ShoppingCart.cartItems.isEmpty()){
                        System.out.println("Danh sách rỗng");
                        break;
                    }
                    System.out.println("Danh sách sản phẩm có trong giỏ: ");
                    ShoppingCart.cartItems.forEach(System.out::println);
                    break;
                case 5:
                    ShoppingCart.checkout();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập từ 1-6");
                    break;
            }
        }
    }

    public static void printPro(){
        if(products.isEmpty()){
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("Danh sách sản phẩm có sẵn: ");
        products.forEach(System.out::println);
    }
}
