package Part_1;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = String.valueOf(sc.nextLine());

        System.out.println("Hi " + name);

    }

}
