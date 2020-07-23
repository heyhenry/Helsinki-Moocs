package Part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class First_and_Last {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();

        System.out.println("Give names: ");

        while (true) {

            String name = sc.nextLine();

            nameList.add(name);

            if (name.isEmpty()) {

                break;

            }

        }

        System.out.println("First name in the array: " + nameList.get(0));
        System.out.println("Last name in the array: " + nameList.get(nameList.size() - 2));

        sc.close();

    }

}
