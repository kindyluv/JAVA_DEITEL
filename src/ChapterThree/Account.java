package ChapterThree;

import java.util.Scanner;

public class Account {
  // private int accountNumber;
  // private double balance;
  // private String customerName;
  // private String email;
  // private int phoneNumber;
    private static Scanner scanner = new Scanner(System.in);
    private static int input = scanner.nextInt();
    private static String name = scanner.next();


    public static void accountNumber(){
      System.out.println("Enter Number: ");
    long accountNumber = scanner.nextLong();
      System.out.println("customer no 1 account number is: " + accountNumber);
    }

     public static double balance(){
       System.out.println("Enter balance");
       double balance = scanner.nextDouble();
        balance += deposit();
       return balance;
     }

     public static String customerName(){
       System.out.println("Enter customers name: ");
       String customerName = scanner.next();

       return customerName;
     }

     public static String email(){
       System.out.println("Enter email address: ");
      String email = scanner.next();

      return email;
     }

    public static int phoneNumber(){
     int phoneNumber = 0;
      System.out.println("Enter mobile number: ");
    phoneNumber = scanner.nextInt();

    return phoneNumber;
    }

     public static double deposit(){
         double deposit = 0;
        double currentBalance = balance();

        deposit = currentBalance + deposit;

        return deposit;
     }

     public static double withdraw(){
       double withdraw = 0;
       double current_Balance = balance();
       withdraw = current_Balance - withdraw;

      return withdraw;
     }

    public static void main(String[] args) {
      accountNumber();

    }
}
