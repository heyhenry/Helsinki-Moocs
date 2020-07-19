package Part_1;

import java.util.Scanner;

public class Leap_Year {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a year: ");
        int year = sc.nextInt();

        if(year % 100 == 0) {

            if(year % 400 == 0) {

                System.out.println("The year is a leap year.");

            } else {

                System.out.println("The year is not a leap year.");

            }

        } else if (year % 4 == 0) {

            System.out.println("The year is a leap year");

        } else {

            System.out.println("The year is not a leap year.");

        }

        sc.close();

    }

}
