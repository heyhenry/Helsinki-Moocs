package Part_3;

public class Sum_of_Array {

    public static int sumOfNumbersInArray(int[] array) {

        int sum = 0;

        for(int num : array) {

            sum = sum + num;

        }

        return sum;

    }

    public static void main(String[] args) {

        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers));

    }

}
