package Part_6;

import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stacks;

    public Stack() {

        this.stacks = new ArrayList<>();

    }

    public boolean isEmpty() {

        if(stacks.isEmpty()) {

            return true;

        } else {

            return false;

        }

    }

    public void add(String value) {

        stacks.add(value);

    }

    public ArrayList<String> values() {

        return stacks;

    }

    public String take() {

        int lastIndex = stacks.size() - 1;

        String lastStack = stacks.get(lastIndex);

        stacks.remove(lastIndex);

        return lastStack;


    }

    public static void main(String[] args) {

//        // tests methods isEmpty(), add(), values()
//        Stack s = new Stack();
//        System.out.println(s.isEmpty());
//        System.out.println(s.values());
//        s.add("Value");
//        System.out.println(s.isEmpty());
//        System.out.println(s.values());

        // tests method take()
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);

//        // tests method take() as well
//        Stack s = new Stack();
//        s.add("1");
//        s.add("2");
//        s.add("3");
//        s.add("4");
//        s.add("5");
//
//        while (!s.isEmpty()) {
//            System.out.println(s.take());
//        }

    }

}
