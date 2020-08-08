package Part_6;

import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts;

    public Package() {

        gifts = new ArrayList<>();

    }

    public void addGift(Gift gift) {

        gifts.add(gift);

    }

    public int totalWeight() {

        int totalGiftWeight = 0;

        for(Gift g : gifts) {

            totalGiftWeight += g.getWeight();

        }

        return totalGiftWeight;

    }

    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }

}
