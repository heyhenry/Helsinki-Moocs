package Part_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Personal_Information {

    private String firstName;
    private String lastName;
    private int identificationNum;

    public Personal_Information(String initialFirstName, String initialLastName) {

        this.firstName = initialFirstName;
        this.lastName = initialLastName;
        this.identificationNum = 0;

    }

    public String toString() {

        return firstName + " " + lastName;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Personal_Information> pi = new ArrayList<>();

        while(true) {

            System.out.println("First name: ");
            String name = sc.nextLine();

            if(name.isEmpty()) {

                break;

            }

            System.out.println("Last name: ");
            String lastName = sc.nextLine();

            System.out.println("Identification number: ");
            int id = sc.nextInt();
            sc.nextLine();

            pi.add(new Personal_Information(name, lastName));

        }

        sc.close();

        System.out.println("");
        for(Personal_Information ipi : pi) {

            System.out.println(ipi);

        }

    }

}
