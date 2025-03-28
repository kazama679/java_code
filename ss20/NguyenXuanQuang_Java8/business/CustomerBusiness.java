package ss20.NguyenXuanQuang_Java8.business;

import ss20.NguyenXuanQuang_Java8.entity.Customer;
import ss20.NguyenXuanQuang_Java8.presentation.ShopManagement;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomerBusiness {
    public void addCustomer(Scanner scanner) {
        System.out.println("Nhập vào số khách hàng cần nhập thông tin:");
        int sizeCustomer = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sizeCustomer; i++) {
            Customer customer = new Customer();
            customer.inputData(scanner);
            ShopManagement.listCustomers.add(customer);
        }
    }

    public void displayCustomers() {
        ShopManagement.listCustomers.forEach(customer -> {
            System.out.println(customer);
            long totalOrders = ShopManagement.listOrders.stream()
                    .filter(order -> order.getCustomer().equals(customer)).count();
            long totalOrdersOverdue = ShopManagement.listOrders.stream()
                    .filter(order -> order.getCustomer().equals(customer) && !order.isStatus() && order.getOrderDate().isBefore(LocalDate.now())).count();
            System.out.printf("Tổng số đơn hàng: %d - Tổng số đơn hàng quá hạn: %d\n", totalOrders, totalOrdersOverdue);
        });

    }
}
