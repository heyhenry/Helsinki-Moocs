package Part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Remember_These_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("Enter numbers: ");

        while (true) {

            int num = sc.nextInt();

            numList.add(num);

            if (num == -1) {

                break;

            }

        }

        int numSize = numList.size() - 1;

        for (int i = 0; i < numSize; i++) {

            System.out.println(numList.get(i));

        }

        sc.close();

    }

}
