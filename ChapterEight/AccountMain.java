package ChapterEight;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(100000);
        account.depositFund(0);
        account.withDrawFund(20000, 1224);

    }
}
