package Part_4;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Guest_List_From_a_File {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> guests = new ArrayList<>();

        System.out.println("Name of the file: ");
        String filename = sc.nextLine();

        try (Scanner file = new Scanner(Paths.get(filename))) {

            while(file.hasNextLine()) {

                guests.add(file.nextLine());

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("Enter names, an empty line quits.");

        while(true) {

            String guestName = sc.nextLine();

            if(guests.contains(guestName)) {

                System.out.println("The name is on the list.");

            } else {

                System.out.println("The name is not on the list.");

            }

            if(guestName.isEmpty()) {

                break;

            }

        }

        System.out.println("Thank you!");

    }

}
