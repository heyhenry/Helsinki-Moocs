package Part_4;

import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Books {

    private String title;
    private int pageNo;
    private int pubYear;

    public Books(String initialTitle, int initialPageNo, int initialPubYear) {

        this.title = initialTitle;
        this.pageNo = initialPageNo;
        this.pubYear = initialPubYear;

    }

    public String toString() {

        return title + ", " + pageNo + " pages, " + pubYear;

    }

    public static void main(String[] args) {

        ArrayList<Books> book = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Title: s");
            String title = sc.nextLine();

            if(title.isEmpty()) {

                break;

            }

            System.out.println("Pages: ");
            int pages = sc.nextInt();

            System.out.println("Publication Year: ");
            int pubYear = sc.nextInt();
            sc.nextLine();

            book.add(new Books(title, pages, pubYear));

        }

        System.out.println("What information will be printed? ");
        String ans = sc.nextLine();

        sc.close();

        for(Books b : book) {

            if(ans.equalsIgnoreCase("Everything")) {

                System.out.println(b);

            } else if(ans.equalsIgnoreCase("Title")) {

                System.out.println(b.title);

            } else if (ans.equalsIgnoreCase("Pages")) {

                System.out.println(b.pageNo);

            } else if(ans.equalsIgnoreCase("Publication Year")) {

                System.out.println(b.pubYear);

            }

        }

    }


}
