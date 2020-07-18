package Part_1;

import java.util.Scanner;

public class Boolean_Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write something: ");
        Boolean ans = Boolean.valueOf(sc.nextLine());

        System.out.println(ans);

    }

}
