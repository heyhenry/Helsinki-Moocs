package Part_5;

public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    double heartyMeal = 4.30;
    double affordableMeal = 2.50;

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        if(payment >= affordableMeal) {

            money = money + affordableMeal;
            affordableMeals++;
            return payment - affordableMeal;

        } else {

            return payment;

        }

    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        if(payment >= heartyMeal) {

            money = money + heartyMeal;
            return payment - heartyMeal;

        } else {

            return payment;

        }

    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned

        if(card.balance() >= affordableMeal) {

            affordableMeals++;
            card.takeMoney(affordableMeal);
            return true;

        } else {

            return false;

        }

    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned

        if(card.balance() >= heartyMeal) {

            heartyMeals++;
            card.takeMoney(heartyMeal);
            return true;

        } else {

            return false;

        }

    }

    public void addMoneyToCard(PaymentCard card, double sum) {

        card.addMoney(sum);
        money = money + sum;

    }


    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

    public static void main(String[] args) {
//        PaymentTerminal unicafeExactum = new PaymentTerminal();
//
//        double change = unicafeExactum.eatAffordably(10);
//        System.out.println("remaining change " + change);
//
//        change = unicafeExactum.eatAffordably(5);
//        System.out.println("remaining change " + change);
//
//        change = unicafeExactum.eatHeartily(4.3);
//        System.out.println("remaining change " + change);
//
//        System.out.println(unicafeExactum);

//        PaymentTerminal unicafeExactum = new PaymentTerminal();
//
//        double change = unicafeExactum.eatAffordably(10);
//        System.out.println("remaining change: " + change);
//
//        PaymentCard annesCard = new PaymentCard(7);
//
//        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        System.out.println(unicafeExactum);

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }

}
