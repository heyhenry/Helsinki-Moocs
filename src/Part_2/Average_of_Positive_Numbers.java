package Part_2;

import java.util.Scanner;

public class Average_of_Positive_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int totalLoops = 0;
        int num;

        while (true) {

            System.out.println("Give a number: ");
            num = sc.nextInt();

            if (num == 0) {

                break;

            } else if(num > 0) {

                sum += num;
                totalLoops++;

            }

        }

        if (sum == 0) {

            System.out.println("Cannot calculate the average");

        } else {

            System.out.println("Average of positive: " + sum / totalLoops);

        }

        sc.close();

    }

}
