package Part_4;

import java.util.Scanner;

public class Number_of_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 0;

        while(true) {

            System.out.println("Print string: ");
            String input = sc.nextLine();

            counter++;

            if(input.equalsIgnoreCase("end")) {

                break;

            }

        }

        sc.close();

        System.out.println("Total strings inputted: " + (counter - 1));

    }

}
