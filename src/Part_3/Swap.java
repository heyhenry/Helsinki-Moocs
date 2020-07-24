package Part_3;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        for(int numero : numbers) {

            System.out.println(numero);

        }

        System.out.println("Give two indices to swap: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int hold = numbers[num2];
        numbers[num2] = numbers[num1];
        numbers[num1] = hold;

        for(int numero : numbers) {

            System.out.println(numero);

        }

        sc.close();

    }

}
