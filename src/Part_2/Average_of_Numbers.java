package Part_2;

import java.util.Scanner;

public class Average_of_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int totalLoops = 0;

        while (true) {

            System.out.println("Give a number: ");
            int num = sc.nextInt();

            sum += num;
            totalLoops++;

            if (num == 0) {

                break;

            }

        }

        System.out.println("Average of the numbers: " + (sum / (totalLoops - 1)));

        sc.close();

    }

}
