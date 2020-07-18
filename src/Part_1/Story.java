package Part_1;

import java.util.Scanner;

public class Story {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        String job;

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        name = String.valueOf(sc.nextLine());

        System.out.println("What is their job?");
        job = String.valueOf(sc.nextLine());

        System.out.println("Here is the story: ");
        System.out.println("Once upon a time there was " + name + ", who was a " + job + ".");
        System.out.println("On the way to work, " + name + " reflected on the life.");
        System.out.println("Perhaps " + name + " will not be a " + job + " forever.");


    }

}
