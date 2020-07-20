package Part_2;

import java.util.Scanner;

public class Carry_On {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Shall we carry on? ");
            String ans = sc.nextLine();

            if(ans.equals("no")) {

                break;

            }

        }

        sc.close();

    }

}
