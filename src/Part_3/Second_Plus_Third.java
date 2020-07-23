package Part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Second_Plus_Third {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.println("Give numbers: ");

        while (true) {

            int num = sc.nextInt();

            numberList.add(num);

            if (num == 0) {

                break;

            }

        }

        System.out.println("Sum of second and third: " + (numberList.get(1) + numberList.get(2)));

        sc.close();

    }

}
