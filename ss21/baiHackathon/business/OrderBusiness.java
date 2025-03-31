package ss21.baiHackathon.business;

import ss21.baiHackathon.entity.Order;
import ss21.baiHackathon.presentation.ShopManagement;

import java.time.LocalDate;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class OrderBusiness implements IOrderBusiness{
    @Override
    public void addOrder(Scanner scanner) {
        System.out.println("Nhâp vào số đơn hàng cần thêm: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Order order = new Order();
            order.inputData(scanner);
            ShopManagement.listOrders.add(order);
        }
    }

    @Override
    public void displayOrders() {
        ShopManagement.listOrders.forEach(System.out::println);
    }

    @Override
    public void updateOrderStatus(Scanner scanner) {
        System.out.println("Nhập vào mã đơn hàng cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        OptionalInt optIndex = IntStream.range(0, ShopManagement.listOrders.size()).filter(index->ShopManagement.listOrders.get(index).getId() == id).findFirst();
        if (optIndex.isPresent()) {
            if(ShopManagement.listOrders.get(optIndex.getAsInt()).getStatus()){
                System.out.println("Đơn hàng đã giao k thể cập nhập trạng thái");
                return;
            }
            ShopManagement.listOrders.get(optIndex.getAsInt()).setStatus(true);
            return;
        }
        System.out.println("K tồn tại mã hóa đơn");
    }

    @Override
    public List<Order> getOrderOverdue() {
        return ShopManagement.listOrders.stream().filter(order->!order.getStatus() && order.getOrderDate().isBefore(LocalDate.now())).toList();
    }

    @Override
    public List<Order> getOrderDelivied() {
        return ShopManagement.listOrders.stream().filter(Order::getStatus).toList();
    }
}
