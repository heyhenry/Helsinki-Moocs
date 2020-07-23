package Part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Index_of_Smallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("Give numbers: ");

        while (true) {

            int num = sc.nextInt();

            numList.add(num);

            if (num == 9999) {

                break;

            }

        }

        int numSize = numList.size() - 1;
        int counter = -1;
        int smallest = numList.get(0);

        for (int i = 0; i < numSize; i++) {

            int number = numList.get(i);

            if (smallest > number) {

                smallest = number;

            }
        }

        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < numSize; i++) {

            counter++;

            if (numList.get(i).equals(smallest)) {

                System.out.println("Found at index: " + counter);

            }

        }

        sc.close();

    }

}
