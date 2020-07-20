package Part_2;

import java.util.Scanner;

public class Only_Positives {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Give a number: ");
            int num = sc.nextInt();

            if (num < 0) {

                System.out.println("Unsuitable number");

            } else if (num > 0) {

                num = num * num;
                System.out.println(num);

            } else {

                break;

            }

        }

        sc.close();

    }

}
