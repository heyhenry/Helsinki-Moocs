package Part_3;

import java.util.Scanner;

public class Name_of_the_Oldest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give text: ");

        int age = 0;
        String name = "";

        while(true) {

            String text = sc.nextLine();

            String[] pieces = text.split(",");

            if(text.isEmpty()) {

                break;

            }

            if(age < Integer.valueOf(pieces[1])) {

                age = Integer.valueOf(pieces[1]);
                name = pieces[0];

            }

        }

        sc.close();

        System.out.println("Name of the oldest: " + name);

    }

}
