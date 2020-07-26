package Part_4;

import java.nio.file.Paths;
import java.util.Scanner;

public class Records_From_a_File {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name of file: ");
        String filename = sc.nextLine();

        try (Scanner file = new Scanner(Paths.get(filename))) {

            while(file.hasNextLine()) {

                String line = file.nextLine();

                String[] pieces = line.split(",");

                System.out.println(pieces[0] + ", age: " + Integer.valueOf(pieces[1]) + " years");

            }

        } catch (Exception e) {

            System.out.println("Reading the file " + filename + " failed.");

        }

    }

}
