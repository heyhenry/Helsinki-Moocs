package Part_1;

import java.util.Scanner;

public class Gift_Tax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Value of the gift? ");
        int value = sc.nextInt();

        double tax;

        if (value >= 5000 && value < 25001) {

            tax = 100 + (value - 5000) * 0.08;
            System.out.println("Tax: " + tax);

        } else if (value >= 25000 && value < 55001) {

            tax = 1700 + (value - 25000) * 0.10;
            System.out.println("Tax: " + tax);

        } else if (value >= 55000 && value < 200001) {

            tax = 4700 + (value - 55000) * 0.12;
            System.out.println("Tax: " + tax);

        } else if (value >= 200000 && value < 1000001) {

            tax = 22100 + (value - 200000) * 0.15;
            System.out.println("Tax: " + tax);

        } else if(value >= 1000000) {

            tax = 142100 + (value - 142100) * 0.17;
            System.out.println("Tax: " + tax);

        } else {

            System.out.println("No tax!");

        }

        sc.close();

    }

}
