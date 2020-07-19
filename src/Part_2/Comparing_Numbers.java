package Part_2;

import java.util.Scanner;

public class Comparing_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give first number: ");
        int num1 = sc.nextInt();

        System.out.println("Give second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {

            System.out.println(num1 + " is greater than " + num2);

        } else if (num1 < num2) {

            System.out.println(num1 + " is smaller than "  + num2);

        } else {

            System.out.println(num1 + " is equal to " + num2);

        }

        sc.close();

    }

}
