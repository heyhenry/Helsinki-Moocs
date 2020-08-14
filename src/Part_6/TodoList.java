package Part_6;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> aList;

    public TodoList() {

        aList = new ArrayList<>();

    }

    public void add(String task) {

        aList.add(task);

    }

    public String print() {

        int taskNo = 0;

        for(int i = 1; i < aList.size(); i++) {

            taskNo = i;

        }

        return taskNo + ": " + aList.get(taskNo);
    }

    public void remove(int number) {

        for(int i = 0; i < aList.size(); i++) {

            aList.remove(i);

        }

    }

    public static void main(String[] args) {

        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        list.print();
        list.remove(2);

        System.out.println();
        list.print();

    }

}
