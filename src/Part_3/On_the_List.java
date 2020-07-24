package Part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class On_the_List {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();

        System.out.println("Give names: ");

        while (true) {

            String name = sc.nextLine();

            nameList.add(name);

            if(name.isEmpty()) {

                break;

            }

        }

        System.out.println("Search for?");
        String searchName = sc.nextLine();

        if(nameList.contains(searchName)) {

            System.out.println(searchName + " was found!");

        } else {

            System.out.println(searchName + " was not found!");

        }

        sc.close();

    }

}
