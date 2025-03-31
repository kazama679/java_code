package ss21.b9;

public class Invalidator extends Exception {
    public Invalidator(String message) {
        super(message);
    }

    public static void validDeposit(double amount) throws Invalidator {
        if(amount < 0){
            throw new Invalidator("Số tiền nạp k thể âm");
        }
    }
    public static void validWithdraw(double amount, double tk) throws Invalidator {
        if(amount > tk){
            throw new Invalidator("Số tiền rút k thể lớn hơn số tiền trong tk");
        }
    }
    public static int validWithdraw2(String id) throws Invalidator {
        for(int i=0; i<B9.accounts.size(); i++){
            if(B9.accounts.get(i).getAccountId().equals(id)){
                return i;
            }
        }
        throw new Invalidator("Tk k tồn tại");
    }
}
