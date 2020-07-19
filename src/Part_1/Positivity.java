package Part_1;

import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num = sc.nextInt();

        if(num > 0) {

            System.out.println("The number is positive.");

        } else {

            System.out.println("The number is not positive.");

        }

        sc.close();

    }

}
