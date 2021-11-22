package ChapterEight;

import java.math.BigDecimal;

public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double depositFund(double deposit) {
        if (balance == balance + deposit){
        this.balance += deposit;
        System.out.println("Transaction successful. Thanks for banking with us....");
    }else if (deposit <= 0){
           System.out.println("Transaction Incomplete, Insufficient Deposit");
       }
        return balance;
    }

    public double withDrawFund(double withdrawal, int pin) {
     
        if (balance > withdrawal && pin == 1234) {
            balance -= withdrawal;
            System.out.println("Transaction Successful");
        } else if (balance < withdrawal && pin == 1234) {
            System.out.println("Insufficient fund. Transaction not Successful");

        }
        if (pin != 1234){
            System.out.println("Incorrect Pin");
        }
        return balance;
    }
}

