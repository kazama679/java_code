package baitap.b1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class B1 {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/Banking_DB";
        String username = "root";
        String password = "quanglienha";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println(connection.getAutoCommit());
            connection.setAutoCommit(false);
            System.out.println( connection.getAutoCommit());
            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Nguyen Van A");
            statement.setString(2, "nguyenvana@gmail.com");
            int rowsInserted = statement.executeUpdate();
            System.out.println("Số dòng được thêm: " + rowsInserted);
            connection.commit();
        } catch (SQLException e) {
            try {
                if (connection != null) {
                    connection.rollback();
                    System.out.println("Đã rollback do lỗi: " + e.getMessage());
                }
            } catch (SQLException rollbackEx) {
                System.out.println("Lỗi khi rollback: " + rollbackEx.getMessage());
            }
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
