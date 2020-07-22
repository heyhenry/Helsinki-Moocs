package Part_2;

public class Divisible_by_Three {

    public static void main(String[] args) {

        divisibleByThreeInRange(2, 10);

    }

    public static void divisibleByThreeInRange (int beginning, int end) {

        for (int i = beginning; i <= end; i++) {

            if(i % 3 == 0) {

                System.out.println(i);

            }

        }

    }

}
