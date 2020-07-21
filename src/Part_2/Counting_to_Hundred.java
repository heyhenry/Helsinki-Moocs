package Part_2;

import java.util.Scanner;

public class Counting_to_Hundred {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num = sc.nextInt();

        for (int i = num; i <= 100; i++) {

            System.out.println(i);

        }

        sc.close();

    }

}
