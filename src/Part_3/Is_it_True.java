package Part_3;

import java.util.Scanner;

public class Is_it_True {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a string: ");
        String word = sc.nextLine();

        if(word.equals("true")) {

            System.out.println("You got it right!");

        } else {

            System.out.println("Try again!");

        }

        sc.close();


    }

}
