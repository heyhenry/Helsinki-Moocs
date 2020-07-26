package Part_4;

import java.nio.file.Paths;
import java.util.Scanner;

public class Sport_Statistics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String filename = sc.nextLine();

        int counter = 0;
        int lossCounter = 0;
        int winCounter = 0;

        System.out.println("Enter team: ");
        String teamName = sc.nextLine();

        try (Scanner file = new Scanner(Paths.get(filename))) {

            while(file.hasNextLine()) {

                String lines = file.nextLine();

                String[] pieces = lines.split(",");

                if(pieces[0].contains(teamName) || pieces[1].contains(teamName)) {

                    counter++;

                }

                if(pieces[0].contains(teamName)) {

                    if(Integer.valueOf(pieces[2]) < Integer.valueOf(pieces[3])) {

                        System.out.println("First IF");
                        lossCounter++;

                    }

                } else if(pieces[1].contains(teamName)) {

                    if(Integer.valueOf(pieces[3]) < Integer.valueOf(pieces[2])) {

                        System.out.println("Second IF");
                        lossCounter++;

                    }

                } else {

                    System.out.println("Third IF");
                    continue;

                }

                if(pieces[1].contains(teamName)) {

                    if(Integer.valueOf(2) < Integer.valueOf(pieces[3])) {

                        winCounter++;

                    } else {

                        continue;

                    }

                }



//                if(pieces[0].contains(teamName)) {
//
//                    if(Integer.valueOf(pieces[2]) < Integer.valueOf(pieces[3])) {
//
//                        System.out.println("L: " + lossCounter);
//                        lossCounter++;
//
//                    }
//
//                }
//
//                if(pieces[1].contains(teamName)) {
//
//                    if(Integer.valueOf(pieces[3]) < Integer.valueOf(pieces[2])) {
//
//                        System.out.println("L: " + lossCounter);
//                        lossCounter++;
//
//                    } else {
//
//                        System.out.println("W: " + winCounter);
//                        winCounter++;
//
//                    }

            }

            System.out.println("Games: " + counter);
            System.out.println("Wins: " + winCounter);
            System.out.println("Losses: " + lossCounter);

        } catch (Exception e) {

            System.out.println("The file " + filename + " could not be found.");

        }


    }

}
