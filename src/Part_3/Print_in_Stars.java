package Part_3;

public class Print_in_Stars {

    public static void printArrayInStars(int[] array) {

        for(int num : array) {

            for(int i = 0; i < num; i++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);

    }

}
