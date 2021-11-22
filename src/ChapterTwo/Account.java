package ChapterTwo;

public class Account {
    private int balance;
    private String name;


    public void deposit(int amountToDeposit) {
        if (amountToDeposit > 0)
        balance = balance + amountToDeposit;
    }

    public void withdraw(int amountToWithdraw, int pin) {
        if (amountToWithdraw < balance && pin == 1234)
            balance = balance - amountToWithdraw;
    }

    public int getbalance() {

        return balance;
    }
}
