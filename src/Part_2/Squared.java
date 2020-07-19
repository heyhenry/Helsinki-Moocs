package Part_2;

import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give number: ");
        int num = sc.nextInt();

        System.out.println("Squared: " + num * num);

        sc.close();

    }

}
