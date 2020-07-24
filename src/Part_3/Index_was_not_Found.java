package Part_3;

import java.util.Scanner;

public class Index_was_not_Found {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        System.out.println("Search for? ");
        int searchNum = sc.nextInt();

        sc.close();

        int index = 0;

        boolean isFound = false;

        while(index < numbers.length) {

            if(numbers[index] == searchNum) {

                System.out.println(searchNum + " is at index " + index + ".");
                isFound = true;
                break;

            }

            index++;

        }

        if(!isFound) {

            System.out.println(searchNum + " was not found.");

        }

    }

}
