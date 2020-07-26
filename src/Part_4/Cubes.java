package Part_4;

import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Print number: ");

        int cubed = 0;

        while(true) {

            int input = Integer.valueOf(sc.nextLine());

            cubed = input * input * input;
            System.out.println(cubed);

            if(sc.nextLine().equalsIgnoreCase("end")) {

                break;

            }

        }

        sc.close();

    }

}
