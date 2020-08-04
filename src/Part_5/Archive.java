package Part_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Archive {

    private String id;
    private String name;

    public Archive(String id, String name) {

        this.id = id;
        this.name = name;

    }

    public boolean equals(Object compared) {

        if(this == compared) {

            return true;

        }

        if(!(compared instanceof Archive)) {

            return false;

        }

        Archive comparedArchive = (Archive) compared;

        if(this.id.equals(comparedArchive.id) && this.name.equals(comparedArchive.name)) {

            return true;

        }

        return false;

    }

    public String toString() {

        return  id + ": " + name;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Archive> a = new ArrayList<>();

        while(true) {

            System.out.println("ID: ");
            String id = sc.nextLine();

            if(id.isEmpty()) {

                break;

            }

            System.out.println("Name: ");
            String name = sc.nextLine();

            if(name.isEmpty()) {

                break;

            }

            Archive an = new Archive(id, name);

            if(a.contains(an)) {

                break;

            }

            a.add(an);

        }

        for(Archive aa : a)  {

            System.out.println(aa);

        }


    }

}
