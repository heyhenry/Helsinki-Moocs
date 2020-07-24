package Part_3;

import java.util.Scanner;

public class Print_Thrice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a word: ");
        String word = sc.nextLine();

        String thrice = word + word + word;

        System.out.println(thrice);

        sc.close();

    }

}
