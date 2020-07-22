package Part_2;

import java.util.Scanner;

public class Repeating_Breaking_and_Remembering {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a numbers: ");

        int sum = 0;
        int totalNums = 0;
        int oddCount = 0;
        int evenCount = 0;

        while (true) {

            int num = sc.nextInt();

            sum = sum + num;
            totalNums++;
            double average = 1.0 * (sum + 1) / (totalNums  - 1);

            if (num == -1) {

                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + (sum + 1));
                System.out.println("Numbers: " + (totalNums - 1));
                System.out.println("Average: " + average);
                System.out.println("Even: " + evenCount);
                System.out.println("Odd: " + oddCount);
                break;

            } else if (num % 2 == 0) {

                evenCount++;

            } else {

                oddCount++;

            }

        }

        sc.close();

    }

}
