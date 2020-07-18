package Part_1;

import java.util.Scanner;

public class Simple_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Give the second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        double divide = 1.0 * num1 / num2;

        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);

    }

}
