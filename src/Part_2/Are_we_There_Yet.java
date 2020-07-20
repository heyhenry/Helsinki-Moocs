package Part_2;

import java.util.Scanner;

public class Are_we_There_Yet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Give a number: ");
            int num = sc.nextInt();

            if(num == 4) {

                break;

            }

        }

        sc.close();

    }

}
