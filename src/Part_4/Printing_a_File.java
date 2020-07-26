package Part_4;

import java.nio.file.Paths;
import java.util.Scanner;

public class Printing_a_File {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(Paths.get("data.txt"))) {

            while(sc.hasNextLine()) {

                String info = sc.nextLine();

                System.out.println(info);

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
