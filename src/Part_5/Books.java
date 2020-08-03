package Part_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {

    private String name;
    private String year;

    public Books(String name, String year) {

        this.name = name;
        this.year = year;

    }

    public boolean equals(Object compared) {

        if(this == compared) {

            return true;

        }

        if(!(compared instanceof Books)) {

            return false;

        }

        Books comparedBooks = (Books) compared;

        if(this.name.equals(comparedBooks.name) && this.year.equals(comparedBooks.year)) {

            return true;

        }

        return false;

    }

    public String toString() {

        return name + ", " + year;

    }

    public static void main(String[] args) {

        ArrayList<Books> b = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Name (empty will stop): ");
            String name = sc.nextLine();

            if(name.isEmpty()) {

                break;

            }

            System.out.println("Publication Year: ");
            String year = sc.nextLine();

            Books book = new Books(name, year);

            if(b.contains(book)) {

                break;

            }

            b.add(book);

        }

        for(Books bb : b) {

            System.out.println(bb);

        }


    }

}
