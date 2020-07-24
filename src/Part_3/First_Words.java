package Part_3;

import java.util.Scanner;

public class First_Words {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give text: ");

        while(true) {

            String text = sc.nextLine();

            String[] pieces = text.split(" ");

            if(text.isEmpty()) {

                break;

            } else {

                    System.out.println(pieces[0]);

            }

        }

        sc.close();

    }

}
