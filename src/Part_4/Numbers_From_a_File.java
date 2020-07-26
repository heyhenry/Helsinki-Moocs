package Part_4;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Numbers_From_a_File {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> numbers = new ArrayList<>();

        System.out.println("File? ");
        String filename = sc.nextLine();

        try (Scanner file = new Scanner(Paths.get(filename))) {

            while(file.hasNextLine()) {

                numbers.add(file.nextLine());

            }

            System.out.println("Lower bound? ");
            int lowerRange = Integer.valueOf(sc.nextLine());

            System.out.println("Upper bound? ");
            int upperRange = Integer.valueOf(sc.nextLine());

            int counter = 0;

            for(String num : numbers) {

                if(Integer.parseInt(num) >= lowerRange && Integer.parseInt(num) <= upperRange) {

                    counter++;

                }

            }

            System.out.println("Numbers: " + counter);


        } catch (Exception e) {

            System.out.println("Reading the file " + filename + " failed.");

        }

//        System.out.println("Lower bound?");
//        int lowerRange = Integer.valueOf(sc.nextLine());
//

    }

}
