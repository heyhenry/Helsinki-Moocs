package Part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Only_These_Numbers {

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

        System.out.println("From where? ");
        int from = sc.nextInt();

        System.out.println("To where? ");
        int to = sc.nextInt();

        for (int i = from; i <= to; i++) {

            System.out.println(numList.get(i));

        }

        sc.close();

    }

}
