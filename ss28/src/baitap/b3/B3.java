package baitap.b3;

import java.sql.*;

public class B3 {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/Banking_DB";
        String username = "root";
        String password = "quanglienha";
        int fromAccountId = 1;
        int toAccountId = 2;
        double amountToTransfer = 1000.0;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(jdbcURL, username, password);
            conn.setAutoCommit(false);
            String checkBalanceSql = "SELECT balance FROM accounts WHERE id = ?";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkBalanceSql)) {
                checkStmt.setInt(1, fromAccountId);
                ResultSet rs = checkStmt.executeQuery();
                if (!rs.next()) {
                    throw new SQLException("Tài khoản nguồn không tồn tại.");
                }
                double currentBalance = rs.getDouble("balance");
                if (currentBalance < amountToTransfer) {
                    throw new SQLException("Không đủ số dư trong tài khoản.");
                }
            }
            String withdrawSql = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            try (PreparedStatement withdrawStmt = conn.prepareStatement(withdrawSql)) {
                withdrawStmt.setDouble(1, amountToTransfer);
                withdrawStmt.setInt(2, fromAccountId);
                withdrawStmt.executeUpdate();
            }
            String depositSql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
            try (PreparedStatement depositStmt = conn.prepareStatement(depositSql)) {
                depositStmt.setDouble(1, amountToTransfer);
                depositStmt.setInt(2, toAccountId);
                int rowsUpdated = depositStmt.executeUpdate();
                if (rowsUpdated == 0) {
                    throw new SQLException("Tài khoản đích không tồn tại.");
                }
            }
            conn.commit();
            System.out.println("Chuyển tiền thành công!");
        } catch (SQLException e) {
            System.out.println("Lỗi xảy ra: " + e.getMessage());
            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("Đã rollback giao dịch.");
                }
            } catch (SQLException rollbackEx) {
                System.out.println("Lỗi rollback: " + rollbackEx.getMessage());
            }
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
