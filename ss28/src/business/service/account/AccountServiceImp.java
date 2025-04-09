package business.service.account;

import business.dao.account.AccountDao;
import business.dao.account.AccountDaoImp;
import business.model.Account;

import java.util.List;

public class AccountServiceImp implements AccountService {
    private final AccountDao accountDao;

    public AccountServiceImp() {
        accountDao = new AccountDaoImp();
    }

    @Override
    public int fundsTransfer(int accSenderId, String accSenderName, int accReceiverId, String accReceiverName, double amount) {
        return accountDao.fundsTransfer(accSenderId, accSenderName, accReceiverId, accReceiverName, amount);
    }

    @Override
    public List<Account> findAllAccounts() {
        return accountDao.findAllAccounts();
    }

    @Override
    public boolean createAccount(Account account) {
        return accountDao.createAccount(account);
    }

    @Override
    public boolean updateAccount(Account account) {
        return accountDao.updateAccount(account);
    }

    @Override
    public boolean deleteAccount(int id) {
        return accountDao.deleteAccount(id);
    }

    @Override
    public double checkBalance(int accId) {
        return accountDao.checkBalance(accId);
    }
}