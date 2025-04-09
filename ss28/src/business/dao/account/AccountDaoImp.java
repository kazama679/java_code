package business.dao.account;

import business.config.ConnectionDB;
import business.model.Account;
import business.model.AccountStatus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoImp implements AccountDao {
    @Override
    public int fundsTransfer(int accSenderId, String accSenderName, int accReceiverId, String accReceiverName, double amount) {
        /*
         * 1. Khởi tạo đối tượng Connection
         * 2. Khởi tạo đối tượng CallableStatement
         * 3. Set giá trị cho các tham số vào
         * 4. Đăng ký kiểu dữ liệu cho tham số ra
         * 5. Thực hiện gọi procedure: executeQuery(), executeUpdate(), execute()
         * 6. Xử lý các dữ liệu nhận được
         * */
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            //set autoComit là false
            conn.setAutoCommit(false);
            callSt = conn.prepareCall("{call funds_transfer_amount(?,?,?,?,?,?)}");
            callSt.setInt(1, accSenderId);
            callSt.setString(2, accSenderName);
            callSt.setInt(3, accReceiverId);
            callSt.setString(4, accReceiverName);
            callSt.setDouble(5, amount);
            callSt.registerOutParameter(6, Types.INTEGER);
            callSt.execute();
            conn.commit();
            return callSt.getInt(6);
        } catch (SQLException e) {
            System.err.println("Có lỗi xảy ra trong quá trình chuyển khoản, dữ liệu đã được rollback");
            try {
                conn.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        } catch (Exception e) {
            System.err.println("Có lỗi không xác định khi làm việc với db: " + e.getMessage());
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return 0;
    }

    @Override
    public List<Account> findAllAccounts() {
        List<Account> accountList = new ArrayList<>();
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all_accounts()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setId(rs.getInt("acc_id"));
                account.setName(rs.getString("acc_name"));
                account.setBalance(rs.getDouble("acc_balance"));
                account.setStatus(AccountStatus.valueOf(rs.getString("acc_status").toUpperCase()));
                accountList.add(account);
            }
        } catch (SQLException e) {
            System.err.println("Lỗi khi lấy danh sách tài khoản: " + e.getMessage());
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return accountList;
    }

    @Override
    public boolean createAccount(Account account) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call create_account(?, ?, ?)}");
            callSt.setString(1, account.getName());
            callSt.setDouble(2, account.getBalance());
            callSt.setString(3, account.getStatus().name().toLowerCase());
            return callSt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Lỗi tạo tài khoản: " + e.getMessage());
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return false;
    }

    @Override
    public boolean updateAccount(Account account) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call update_account(?, ?, ?)}");
            callSt.setInt(1, account.getId());
            callSt.setString(2, account.getName());
            callSt.setString(3, account.getStatus().name().toLowerCase());
            return callSt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Lỗi cập nhật tài khoản: " + e.getMessage());
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return false;
    }

    @Override
    public boolean deleteAccount(int id) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call delete_account(?)}");
            callSt.setInt(1, id);
            return callSt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Lỗi khi xóa: " + e.getMessage());
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return false;
    }

    @Override
    public double checkBalance(int accId) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call get_balance_by_id(?, ?)}");
            callSt.setInt(1, accId);
            callSt.registerOutParameter(2, Types.DECIMAL);
            callSt.execute();
            return callSt.getDouble(2);
        } catch (SQLException e) {
            System.err.println("Lỗi tra cứu số dư: " + e.getMessage());
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return -1;
    }
}