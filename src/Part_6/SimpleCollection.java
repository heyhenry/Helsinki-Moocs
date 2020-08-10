package Part_6;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public String longest() {

        if(col.isEmpty()) {

            return null;

        }

        String longOne = col.get(0);

        for(int i = 0; i < col.size(); i++) {

            String indexo = col.get(i);

            if(longOne.length() < indexo.length()) {

                longOne = indexo;

            }

        }

        return longOne;

    }

    public static void main(String[] args) {

//        SimpleCollection s = new SimpleCollection("alphabet");
//        System.out.println(s);
//
//        System.out.println();
//
//        s.add("a");
//        System.out.println(s);
//
//        System.out.println();
//
//        s.add("b");
//        System.out.println(s);
//
//        System.out.println();
//
//        s.add("c");
//        System.out.println(s);

        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());

    }

}
