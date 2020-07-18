package Part_1;

import java.util.Scanner;

public class Message_Three_Times {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write a message: ");
        String msg = String.valueOf(sc.nextLine());

        System.out.println(msg);
        System.out.println(msg);
        System.out.println(msg);

    }

}
