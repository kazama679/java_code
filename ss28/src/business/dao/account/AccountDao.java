package business.dao.account;

import business.dao.AppDao;
import business.model.Account;

import java.util.List;

public interface AccountDao extends AppDao {
    int fundsTransfer(int accSenderId, String accSenderName, int accReceiverId, String accReceiverName, double amount);
    List<Account> findAllAccounts();
    boolean createAccount(Account account);
    boolean updateAccount(Account account);
    boolean deleteAccount(int id);
    double checkBalance(int accId);
}