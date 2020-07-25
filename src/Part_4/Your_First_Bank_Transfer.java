package Part_4;

public class Your_First_Bank_Transfer {

    public static void main(String[] args) {

        Account MatthewsAccount = new Account("Matthews Account", 1000);
        Account MyAccount = new Account("My Account", 0);

        MatthewsAccount.withdraw(100);

        MyAccount.deposit(100);

        System.out.println(MatthewsAccount);
        System.out.println(MyAccount);

    }

}
