package Part_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {

    private int count;

    ArrayList<Integer> nums = new ArrayList<>();

    public Statistics() {

    }

    public void addNumber(int number) {

        nums.add(number);

        count++;

    }

    public int getCount() {

        return count;

    }

    public int sum() {

        int total = 0;

        for(int num : nums) {

            total = total + num;

        }

        return total;

    }

    public double average() {

        return 1.0 * sum() / getCount();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Statistics statistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();

//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());

        System.out.println("Enter numbers: ");

        while(true) {

            int num = sc.nextInt();

            statistics.addNumber(num);

            if(num % 2 == 0) {

                evenStatistics.addNumber(num);

            } else {

                oddStatistics.addNumber(num);

            }

            if(num == -1) {

                break;

            }

        }

        sc.close();

        System.out.println("Sum: " + (statistics.sum() + 1));
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + (oddStatistics.sum() + 1));

    }


}
