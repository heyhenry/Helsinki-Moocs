package Part_2;

import java.util.Scanner;

public class Number_of_Negative_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalNegativeLoops = 0;

        while(true) {

            System.out.println("Give a number: ");
            int num = sc.nextInt();

            if(num < 0) {

                totalNegativeLoops++;

            }
            else if(num == 0) {

                break;

            }

        }

        System.out.println("Number of negative numbers: " + totalNegativeLoops);

        sc.close();

    }

}
