package Part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Greatest_in_List {

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

        sc.close();

        int numSize = numList.size() - 1;
        int greatest = numList.get(0);

        for (int i = 0; i < numSize; i++) {

            int number = numList.get(i);

            if (greatest < number) {

                greatest = number;

            }

        }

        System.out.println("Greatest number is: " + greatest);

    }

}
