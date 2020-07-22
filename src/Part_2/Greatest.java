package Part_2;

public class Greatest {

    public static int greatest (int number1, int number2, int number3) {

        if (number1 > number2) {

            if (number1 > number3) {

                return number1;

            } else {

                return number3;

            }

        } else {

            return number2;

        }

    }

    public static void main(String[] args) {

        int answer = greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);

    }

}
