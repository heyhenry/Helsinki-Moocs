package Part_4;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Is_it_in_the_File {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.println("Name of the file: ");
        String filename = sc.nextLine();

        System.out.println("Search for: ");
        String searchString = sc.nextLine();

        try (Scanner file = new Scanner(Paths.get(filename))) {

            while(file.hasNextLine()) {

                names.add(file.nextLine());

            }

            if(names.contains(searchString)) {

                System.out.println("Found!");

            } else {

                System.out.println("Not found.");

            }

        } catch (Exception e) {

            System.out.println("Reading the file " + filename + " failed.");

        }

    }

}
