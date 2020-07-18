package Part_1;

import java.util.Scanner;

public class Sum_of_Two_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Give the second number: ");
        int num2 = sc.nextInt();

        System.out.println("The sum of the numbers is " + (num1 + num2));

    }

}
