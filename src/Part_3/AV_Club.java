package Part_3;

import java.util.Scanner;

public class AV_Club {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");

        while(true) {

            String text = sc.nextLine();

            String[] pieces = text.split(" ");

            if(text.isEmpty()) {

                break;

            } else {

                for (String piece : pieces) {

                    if (piece.contains("av")) {

                        System.out.println(piece);

                    }

                }

            }

        }

        sc.close();

    }

}
