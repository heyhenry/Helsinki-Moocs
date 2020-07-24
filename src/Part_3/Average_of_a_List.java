package Part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Average_of_a_List {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("Give numbers: ");

        while(true) {

            int num = sc.nextInt();

            numList.add(num);

            if(num == -1) {

                break;

            }

        }

        sc.close();

        int sum = 0;
        int counter = 0;

        for(int numero : numList) {
            counter++;
            sum = sum + numero;

        }

        double average = (1.0 * (sum + 1) / (counter - 1));

        System.out.println("Average: " + average);

    }

}
