package Part_1;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Password? ");
        String pass = sc.nextLine();

        if(pass.equals("Caput Draconis")) {

            System.out.println("Welcome!");

        } else {

            System.out.println("Off with you!");

        }

        sc.close();

    }

}
