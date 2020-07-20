package Part_2;

import java.util.Scanner;

public class Number_of_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalLoops = 0;

        while (true) {

            System.out.println("Give a number: ");
            int num = sc.nextInt();

            totalLoops++;

            if(num == 0) {

                break;

            }

        }

        System.out.println("Number of numbers: " + (totalLoops - 1));

        sc.close();

    }

}
