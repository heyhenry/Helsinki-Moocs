package Part_6;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> taskList;

    private int taskNo = 0;

    public TodoList() {

        taskList = new ArrayList<>();

    }

    public void add(String task) {

        taskList.add(task);

    }

    public String print() {

//        for(int i = 1; i < aList.size(); i++) {
//
//            taskNo = i;
//
//        }
//
//        return taskNo + ": " + aList.get(taskNo);

        for(int i = 0; i < taskList.size(); i++) {

            taskNo =  i + 1;
            System.out.println(taskNo + ": " + taskList.get(i));

        }

        return "";

    }

    public void remove(int number) {

        taskList.remove(taskList.get(number));

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
