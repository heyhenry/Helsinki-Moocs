package Part_2;

import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many times? ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

             printText();

        }

        sc.close();

    }

    public static void printText() {

        System.out.println("In a hole in the ground there lived a method");

    }

}
