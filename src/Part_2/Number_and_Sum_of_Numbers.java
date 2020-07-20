package Part_2;

import java.util.Scanner;

public class Number_and_Sum_of_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int totalLoops = 0;

        while (true) {

            System.out.println("Give a number: ");
            int num = sc.nextInt();

            totalLoops++;
            sum += num;

            if(num == 0) {

                break;

            }

        }

        System.out.println("Number of numbers: " + (totalLoops - 1));
        System.out.println("Sum of the numbers: " + sum);

        sc.close();

    }

}
