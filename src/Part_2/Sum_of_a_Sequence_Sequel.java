package Part_2;

import java.util.Scanner;

public class Sum_of_a_Sequence_Sequel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("First number? ");
        int firstNum = sc.nextInt();

        System.out.println("Last number? ");
        int lastNum = sc.nextInt();

        int sum = 0;

        for (int i = firstNum; i <= lastNum; i++) {

            sum = sum + i;

        }

        System.out.println("The sum is " + sum);

        sc.close();

    }


}
