package Part_2;

import java.util.Scanner;

public class Square_Root_of_Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give first number: ");
        int num1 = sc.nextInt();

        System.out.println("Give second number: ");
        int num2 = sc.nextInt();

        double squareRoot = Math.sqrt(num1 + num2);

        System.out.println((int)squareRoot);

        sc.close();

    }

}
