package baitap.b2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class B2 {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/Banking_DB";
        String username = "root";
        String password = "quanglienha";
        Connection connection = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;

        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Đã kết nối đến cơ sở dữ liệu.");
            connection.setAutoCommit(false);
            String sql1 = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";
            stmt1 = connection.prepareStatement(sql1);
            stmt1.setInt(1, 1);
            stmt1.setString(2, "Nguyen Van A");
            stmt1.setString(3, "a@example.com");
            stmt1.executeUpdate();
            System.out.println("Đã thêm bản ghi hợp lệ.");
            String sql2 = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";
            stmt2 = connection.prepareStatement(sql2);
            stmt2.setInt(1, 1); // id bị trùng -> sẽ gây lỗi
            stmt2.setString(2, "Le Van B");
            stmt2.setString(3, "b@example.com");
            stmt2.executeUpdate();
            connection.commit();
            System.out.println("Giao dịch đã commit thành công.");
        } catch (SQLException e) {
            System.out.println("Lỗi xảy ra: " + e.getMessage());
            try {
                if (connection != null) {
                    connection.rollback();
                    System.out.println("Đã rollback toàn bộ giao dịch.");
                }
            } catch (SQLException rollbackEx) {
                System.out.println("Lỗi khi rollback: " + rollbackEx.getMessage());
            }
        } finally {
            try {
                if (stmt1 != null) stmt1.close();
                if (stmt2 != null) stmt2.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
