package ss22.b8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class B8 {
    private static final String name = "products.dat";

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Laptop", 150));
        productList.add(new Product(2, "Chuột", 50));
        productList.add(new Product(3, "Bàn phím", 25));
        writeProductsToFile(productList);
        List<Product> readProducts = readProductsFromFile();
        System.out.println("Danh sách sản phẩm:");
        for (Product product : readProducts) {
            System.out.println(product);
        }
    }

    private static void writeProductsToFile(List<Product> products) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Product> readProductsFromFile() {
        List<Product> products = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(name))) {
            products = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
