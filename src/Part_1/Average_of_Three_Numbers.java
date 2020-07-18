package Part_1;

import java.util.Scanner;

public class Average_of_Three_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Give the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Give the third number: ");
        int num3 = sc.nextInt();

        double average = 1.0 * (num1 + num2+ num3) / 3;

        System.out.println("The average is " + average);

    }

}
