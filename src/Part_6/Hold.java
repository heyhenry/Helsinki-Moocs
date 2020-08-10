package Part_6;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    private int totalWeight = 0;
    private int suitcaseCounter = 0;
    private int actualSuitcasesWeight = 0;

    public Hold(int maxWeight) {

        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();

    }

    public void addSuitcase(Suitcase suitcase) {

        int aSuitcaseWeight = suitcase.totalWeight();

        totalWeight += aSuitcaseWeight;

        if(totalWeight < maxWeight) {

            actualSuitcasesWeight = totalWeight;
            suitcaseCounter++;
            suitcases.add(suitcase);

        }

    }

    public void printItems() {

        for(Suitcase sc : suitcases) {

            System.out.println(sc.printItems());

        }

    }

    public String toString() {

        return suitcaseCounter + " suitcases (" + actualSuitcasesWeight + " kg)";

    }

    public static void main(String[] args) {

//        Item book = new Item("Lord of the rings", 2);
//        Item phone = new Item("Nokia 3210", 1);
//        Item brick = new Item("brick", 4);
//
//        Suitcase adasCase = new Suitcase(10);
//        adasCase.addItem(book);
//        adasCase.addItem(phone);
//
//        Suitcase pekkasCase = new Suitcase(10);
//        pekkasCase.addItem(brick);
//
//        Hold hold = new Hold(1000);
//        hold.addSuitcase(adasCase);
//        hold.addSuitcase(pekkasCase);
//
//        System.out.println(hold);

        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();

    }

}
