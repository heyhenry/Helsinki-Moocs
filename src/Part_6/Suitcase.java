package Part_6;

import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    private int totalWeight = 0;
    private int itemCounter = 0;
    private int actualWeight = 0;

    public Suitcase(int maxWeight) {

        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();

    }

    public void addItem(Item item) {

        int anItemWeight = item.getWeight();

        totalWeight += anItemWeight;

        if (totalWeight < maxWeight) {

            actualWeight = totalWeight;
            itemCounter++;
            items.add(item);

        }

    }

    public String toString() {

        if(items.isEmpty()) {

            return "No items" + " (" + actualWeight + " kg)";

        } else {

            if(items.size() == 1) {

                return itemCounter + " item " + "(" + actualWeight + " kg)";

            } else if(items.size() > 1) {

                return itemCounter + " items " + "(" +  actualWeight + " kg)";

            }

        }

        return "";

    }

    public Item printItems() {

        for(Item i : items) {

            System.out.println(i);

        }

        return null;
    }

    public int totalWeight() {

        return totalWeight;

    }

    public Item heaviestItem() {

        if(items.isEmpty()) {

            return null;

        }

        Item firstItem = items.get(0);

        for(int i = 0; i < items.size(); i++) {

            Item currentItem = items.get(i);

            if(firstItem.getWeight() < currentItem.getWeight()) {

                firstItem = currentItem;

            }

        }

        return firstItem;

    }

    public static void main(String[] args) {

//        Item book = new Item("Lord of the rings", 2);
//        Item phone = new Item("Nokia 3210", 1);
//        Item brick = new Item("brick", 4);
//
//        Suitcase suitcase = new Suitcase(5);
//        System.out.println(suitcase);
//
//        suitcase.addItem(book);
//        System.out.println(suitcase);
//
//        suitcase.addItem(phone);
//        System.out.println(suitcase);
//
//        suitcase.addItem(brick);
//        System.out.println(suitcase);

        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");

//        Item book = new Item("Lord of the rings", 2);
//        Item phone = new Item("Nokia 3210", 1);
//        Item brick = new Item("Brick", 4);
//
//        Suitcase suitcase = new Suitcase(10);
//        suitcase.addItem(book);
//        suitcase.addItem(phone);
//        suitcase.addItem(brick);
//
//        Item heaviest = suitcase.heaviestItem();
//        System.out.println("Heaviest item: " + heaviest);


    }

}
