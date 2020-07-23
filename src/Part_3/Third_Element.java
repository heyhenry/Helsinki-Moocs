package Part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Third_Element {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.println("Give names: ");

        while (true) {

            String name = sc.nextLine();

            names.add(name);

            if (name.equals("")) {

                break;

            }

        }

        System.out.println(names.get(2));

        sc.close();

    }

}
