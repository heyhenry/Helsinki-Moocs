package Part_2;

import java.util.Scanner;

public class Absolute_Value {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give number: ");
        int num = sc.nextInt();

        if(num < 0) {

            System.out.println(num * -1);

        } else {

            System.out.println(num);

        }

        sc.close();

    }

}
