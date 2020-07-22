package Part_2;

public class Advanced_Astrology {

    public static void printStars (int number) {

        for (int i = 0; i < number; i++) {

            System.out.print("*");

        }

        System.out.println("");

    }

    public static void printSpaces (int number) {

        for (int i = 1; i <= number; i++) {

            System.out.print(" ");

        }

    }

    public static void printTriangle (int size) {

        for (int i = 1; i <= size; i++) {

            printSpaces(size - i);
            printStars(i);

        }

    }

    public static void christmasTree (int height) {

        for (int i = 0; i < height; i++) {

            printSpaces(height -  i);
            printStars(i * 2 + 1);

        }

        for (int i = 1; i <= 2; i++) {

            printSpaces(height - 1);
            printStars(3);

        }

    }

    public static void main(String[] args) {

//        printStars(4);
//        printStars(9);
//        printStars(3);

//        printTriangle(4);

        christmasTree(10);

    }

}
