package Part_1;

import java.util.Scanner;

public class Multiplication_Formula {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Give the second number: ");
        int num2 = sc.nextInt();

        int multiplied = num1 * num2;

        System.out.println(num1 + " * " + num2 + " = " + multiplied);

    }


}
