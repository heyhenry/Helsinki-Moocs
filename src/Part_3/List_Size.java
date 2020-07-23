package Part_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class List_Size {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();

        System.out.println("Give names: ");

        while (true) {

            String name = sc.nextLine();

            nameList.add(name);

            if (name.equals("")) {

                break;

            }

        }

        System.out.println("In total: " + (nameList.size() - 1));

        sc.close();

    }

}
