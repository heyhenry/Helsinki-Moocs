package Part_2;

import java.util.Scanner;

public class Where_From {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Where to? ");
        int to = sc.nextInt();

        System.out.println("Where from? ");
        int from = sc.nextInt();

        for (int i = from; i <= to; i++) {

            System.out.println(i);

        }

        sc.close();

    }

}
