package ss18.b9;

import java.util.Map;
import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addProduct(Scanner scanner) {
        System.out.print("Nhập id: ");
        while (true) {
            int id = Integer.parseInt(scanner.nextLine());
            boolean check = false;
            for (Map.Entry<Integer, Product> entry : B9.productsMap.entrySet()) {
                if(id == entry.getKey()) {
                    System.out.println("id đã tồn tại, nhập lại");
                    check = true;
                    break;
                }
            }
            if(!check) {
                this.id = id;
                break;
            }
        }
        System.out.print("name: ");
        this.name = scanner.nextLine();
        System.out.print("price: ");
        while(true) {
            double price = Double.parseDouble(scanner.nextLine());
            if(price > 0) {
                this.price = price;
                break;
            }
            System.out.println("Gía k đc nhỏ hơn 0, nhập lại");
        }
        System.out.print("quantity: ");
        while(true) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if(quantity > 0) {
                this.quantity = quantity;
                break;
            }
            System.out.println("Số lượng k đc nhỏ hơn 0, nhập lại");
        }
    }

    public void print(){
        System.out.println("------------------");
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("price: "+price);
        System.out.println("quantity: "+quantity);
    }
}
