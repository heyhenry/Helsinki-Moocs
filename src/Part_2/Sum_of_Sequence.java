package Part_2;

import java.util.Scanner;

public class Sum_of_Sequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Last number? ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i++) {

             sum = sum + i;

        }

        System.out.println("The sum is " + sum);

        sc.close();

    }

}
