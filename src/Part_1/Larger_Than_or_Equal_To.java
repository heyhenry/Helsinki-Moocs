package Part_1;

import java.util.Scanner;

public class Larger_Than_or_Equal_To {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Give the second number: ");
        int num2 = sc.nextInt();

        if(num1 > num2) {

            System.out.println("Greater number is: " + num1);

        } else if (num2 > num1) {

            System.out.println("Greater number is: " + num2);

        } else {

            System.out.println("The numbers are equal!");

        }

        sc.close();

    }

}
