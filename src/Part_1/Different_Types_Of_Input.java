package Part_1;

import java.util.Scanner;

public class Different_Types_Of_Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a string: ");
        String str = sc.nextLine();

        System.out.println("Give an integer: ");
        int num = sc.nextInt();

        System.out.println("Give a double: ");
        double dub = sc.nextDouble();

        System.out.println("Give a boolean: ");
        boolean bool = sc.nextBoolean();

        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + dub);
        System.out.println("You gave the boolean " + bool);


    }

}
