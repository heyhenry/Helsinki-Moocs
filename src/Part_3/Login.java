package Part_3;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = sc.nextLine();

        System.out.println("Enter password: ");
        String password = sc.nextLine();

        if(username.equals("alex") && password.equals("sunshine")) {

            System.out.println("You have successfully logged in!");

        } else if (username.equals("emma") && password.equals("haskell")) {

            System.out.println("You have successfully logged in!");

        } else {

            System.out.println("Incorrect username or password!");

        }

        sc.close();

    }

}
