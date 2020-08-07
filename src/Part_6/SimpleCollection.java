package Part_6;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class SimpleCollection {

    private String something;
    private ArrayList<String> col;

    public SimpleCollection(String something) {

        this.something = something;
        this.col = new ArrayList<>();

    }

    public void add(String addToArray) {

        col.add(addToArray);

    }

    public String okc() {

        for(String op : col) {


        }

        return "";

    }

    public String toString() {

        int arraySize = col.size();
        String output = "";

            if (col.isEmpty()) {

                output = "The collection " + something + " is empty.\n" + col;

            } else if (col.size() == 1) {

                output = "The collection " + something + " has " + arraySize + " element.\n" + col;

            } else if (col.size() > 1) {

                output = "The collection " + something + " has " + arraySize + " elements.\n" + col;
            }

        return output;

    }

    public static void main(String[] args) {

        SimpleCollection s = new SimpleCollection("alphabet");
        System.out.println(s);

        System.out.println();

        s.add("a");
        System.out.println(s);

        System.out.println();

        s.add("b");
        System.out.println(s);

        System.out.println();

        s.add("c");
        System.out.println(s);

    }

}
