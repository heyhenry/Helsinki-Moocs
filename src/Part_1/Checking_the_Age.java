package Part_1;

import java.util.Scanner;

public class Checking_the_Age {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you? ");
        int age = sc.nextInt();

        if(age >= 0 && age <= 120) {

            System.out.println("OK");

        } else {

            System.out.println("Impossible!");

        }

        sc.close();

    }

}
