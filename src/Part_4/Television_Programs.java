package Part_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Television_Programs {

    private String name;
    private int duration;

    public Television_Programs(String initialName, int initialDuration) {

        this.name = initialName;
        this.duration = initialDuration;

    }

    public String toString() {

        return name + ", " + duration + " minutes";

    }

    public static void main(String[] args) {

        ArrayList<Television_Programs> teleprogs = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Name: ");
            String name = sc.nextLine();

            if(name.isEmpty()) {

                break;

            }

            System.out.println("Duration: ");
            int duration = sc.nextInt();
            sc.nextLine();



            teleprogs.add(new Television_Programs(name, duration));

        }

        System.out.println("Program's maximum duration? ");
        int maxDuration = sc.nextInt();

        sc.close();

        for(Television_Programs telep : teleprogs) {

            if(telep.duration <= maxDuration) {

                System.out.println(telep);

            }

        }

    }

}


