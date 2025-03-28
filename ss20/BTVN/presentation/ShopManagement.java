package ss20.BTVN.presentation;

import ss20.BTVN.business.CustomerBusiness;
import ss20.BTVN.business.OrderBusiness;
import ss20.BTVN.entity.Customer;
import ss20.BTVN.entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    public static final List<Customer> listCustomers = new ArrayList<>();
    public static final List<Order> listOrders = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerBusiness customerBusiness = new CustomerBusiness();
        OrderBusiness orderBusiness = new OrderBusiness();

        while (true) {
            System.out.println("********************* SHOP MENU ******************");
            System.out.println("1. Quản lý khách hàng");
            System.out.println("2. Quản lý đơn hàng");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuCustomer(scanner, customerBusiness);
                    break;
                case 2:
                    menuOrder(scanner, orderBusiness);
                    break;
                case 3:
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1-3.");
            }
        }
    }

    public static void menuCustomer(Scanner scanner, CustomerBusiness customerBusiness) {
        int choice;
        do {
            System.out.println("********************* CUSTOMER MENU ********************");
            System.out.println("1. Danh sách khách hàng");
            System.out.println("2. Thêm mới khách hàng");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerBusiness.displayCustomers();
                    break;
                case 2:
                    customerBusiness.addCustomer(scanner);
                    break;
                case 3:
                    System.out.println("Thoát menu khách hàng.");
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1-3.");
            }
        } while (choice != 3);
    }

    public static void menuOrder(Scanner scanner, OrderBusiness orderBusiness) {
        int choice;
        do {
            System.out.println("********************* ORDER MENU ********************");
            System.out.println("1. Danh sách đơn hàng");
            System.out.println("2. Thêm mới đơn hàng");
            System.out.println("3. Cập nhật trạng thái đơn hàng");
            System.out.println("4. Danh sách đơn hàng quá hạn");
            System.out.println("5. Số lượng đơn hàng đã giao");
            System.out.println("6. Tổng doanh thu các đơn hàng đã giao");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    orderBusiness.displayOrders();
                    break;
                case 2:
                    orderBusiness.addOrder(scanner);
                    break;
                case 3:
                    orderBusiness.updateOrderStatus(scanner);
                    break;
                case 4:
                    List<Order> overdueOrders = orderBusiness.getOrderOverdue();
                    if (overdueOrders.isEmpty()) {
                        System.out.println("Không có đơn hàng quá hạn.");
                    } else {
                        overdueOrders.forEach(System.out::println);
                    }
                    break;
                case 5:
                    long deliveredCount = orderBusiness.getOrderDelivied().size();
                    System.out.println("Số lượng đơn hàng đã giao: " + deliveredCount);
                    break;
                case 6:
                    double totalRevenue = orderBusiness.getTotalRevenue();
                    System.out.println("Tổng doanh thu từ đơn hàng đã giao: " + totalRevenue);
                    break;
                case 7:
                    System.out.println("Thoát menu đơn hàng.");
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1-7.");
            }
        } while (choice != 7);
    }
}