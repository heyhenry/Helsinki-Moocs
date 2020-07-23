package Part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Index_Of {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("Give numbers: ");

        while (true) {

            int num = sc.nextInt();

            numList.add(num);

            if (num == -1) {

                break;

            }

        }

        int numSize = numList.size() - 1;

        System.out.println("Search for? ");
        int searchNum = sc.nextInt();

        int counter = -1;

        for (int i = 0; i < numSize; i++) {

            counter++;

            if (numList.get(i).equals(searchNum)) {

                System.out.println(searchNum + " is at index " + counter);

            }

        }

        sc.close();

    }

}
