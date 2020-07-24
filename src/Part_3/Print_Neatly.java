package Part_3;

public class Print_Neatly {

    public static void printNeatly(int[] array) {

//        String coms = ", ";
//
//        for(int num : array) {
//
//            System.out.print(num + coms);
//
//        }

        int index = 0;

        for(int i = 0; i < array.length; i++) {

            if (i > 0) {

                System.out.print(", ");

            }
            System.out.print(array[index]);

            index++;

        }

    }

    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);

    }

}
