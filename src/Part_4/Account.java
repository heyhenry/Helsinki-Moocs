package Part_4;

import java.util.ArrayList;

public class Account {

    String accountName;
    double accountBalance;
    ArrayList<Object> accounts = new ArrayList<>();

    public Account(String accountN, double accountB) {

        accountName = accountN;
        accountBalance = accountB;
        accounts.add(this);

    }

    public void withdraw(double amount) {

        accountBalance = accountBalance - amount;

    }

    public void deposit(double amount) {

        accountBalance = accountBalance + amount;

    }

    public double balance() {

        return accountBalance;


    }

    public String toString() {

        return accountName + ", " + accountBalance;

    }

    public static void main(String[] args) {

        Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        artosAccount.withdraw(20);
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
        artosSwissAccount.deposit(200);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

        System.out.println("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

    }

}
