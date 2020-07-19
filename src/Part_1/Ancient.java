package Part_1;

import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a year: ");
        int year = sc.nextInt();

        if(year < 2015) {

            System.out.println("Ancient history!");

        }

        sc.close();

    }

}
