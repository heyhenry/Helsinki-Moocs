package Part_4;

import java.nio.file.Paths;
import java.util.Scanner;

public class Printing_a_Specified_File {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose text file: ");
        String input = sc.nextLine();

        try (Scanner file = new Scanner(Paths.get(input))) {

            while(file.hasNextLine()) {

                System.out.println(file.nextLine());

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
