package Part_3;

import java.util.Scanner;

public class Line_by_Line {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = sc.nextLine();

        String[] pieces = text.split(" ");

        for (String piece : pieces) {

            System.out.println(piece);

        }

        sc.close();

    }

}
