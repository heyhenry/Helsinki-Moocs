package Part_4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    ArrayList<String> names = new ArrayList<>();

    private String name;

    public Items(String initialName) {

        this.name = initialName;

    }

    public String toString() {

        return name + " (created at: " + LocalDateTime.now() + ")";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Items> ItemList = new ArrayList<>();

        while(true) {

            System.out.println("Name: ");
            String name = sc.nextLine();

            if(name.isEmpty()) {

                break;

            }

            ItemList.add(new Items(name));

        }

        sc.close();

        System.out.println("");
        for(Items item : ItemList) {

            System.out.println(item);

        }

    }

}
