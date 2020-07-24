package Part_3;

import java.util.Scanner;

public class Age_of_the_Oldest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name and age separated by a comma: ");

        int age = 0;

        while(true) {

            String text = sc.nextLine();

            if(text.isEmpty()) {

                break;

            }

            String[] pieces = text.split(",");

            if(age < Integer.valueOf(pieces[1])) {

                age = Integer.valueOf(pieces[1]);

            }

        }

        sc.close();

        System.out.println("Age of the oldest: " + age);

    }

}
