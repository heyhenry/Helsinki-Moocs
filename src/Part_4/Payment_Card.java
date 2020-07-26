package Part_4;

public class Payment_Card {

    private double balance;

    public Payment_Card(double openingBalance) {

        this.balance = openingBalance;

    }

    public String toString() {

        return "The card has a balance of " + balance + " euros";

    }

    public void eatAffordably() {

        balance = balance - 2.60;

        if(balance < 0) {

            balance = 0;

        }

    }

    public void eatHeartily() {

        balance = balance - 4.60;

        if(balance < 0) {

            balance = balance + 4.60;

        }

    }

    public void addMoney(double amount) {

        balance = balance + amount;

        if(balance > 150) {

            balance = 150;

        } else if(balance < 0) {

            balance = balance - amount;

        }

    }


}
