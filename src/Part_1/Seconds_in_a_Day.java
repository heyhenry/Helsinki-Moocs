package Part_1;

import java.util.Scanner;

public class Seconds_in_a_Day {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = sc.nextInt();

        System.out.println(days * (24 * 60 * 60));

    }

}
