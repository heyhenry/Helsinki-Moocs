package Part_2;

import java.util.Scanner;

public class From_Where_to_Where {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Where to? ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {

            System.out.println(i);

        }

        sc.close();

    }

}
