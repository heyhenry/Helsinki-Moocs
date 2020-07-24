package Part_3;

import java.util.Scanner;

public class Personal_Details {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");

        int longestName = 0;
        String name = "";
        int sum = 0;
        int counter = 0;

        while(true) {

            String text = sc.nextLine();

            String[] pieces = text.split(",");

            if(text.isEmpty()) {

                break;

            }

            if(longestName < pieces[0].length()) {

                longestName = pieces[0].length();
                name = pieces[0];

            }

            sum = sum + Integer.valueOf(pieces[1]);
            counter++;

        }

        sc.close();

        System.out.println("Longest name: " + name);
        System.out.println("Average of birth years: " + (1.0 * sum / counter));

    }

}
