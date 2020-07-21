package Part_2;

import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num = sc.nextInt();

        for(int i = 0; i <= num; i++) {

            System.out.println(i);

        }

        sc.close();

    }

}
