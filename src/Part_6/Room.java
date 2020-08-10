package Part_6;

import java.util.ArrayList;

public class Room {

    private ArrayList<Person> people;

    public Room() {

        people = new ArrayList<>();

    }

    public void add(Person person) {

        people.add(person);

    }

    public boolean isEmpty() {

        if(people.isEmpty()) {

            return true;

        }

        return false;

    }

    public ArrayList<Person> getPersons() {

        return people;

    }

    public Person shortest() {

        if(people.isEmpty()) {

            return null;

        }

        Person p = people.get(0);

        for(int i = 0; i < people.size(); i++) {

            Person currentP = people.get(i);

            if(p.getHeight() > currentP.getHeight()) {

                p = currentP;

            }

        }

        return p;

    }

    public Person take() {

        if(people.isEmpty()) {

            return null;

        }

        Person p = people.get(0);

        int removeIndex = 0;

        for(int i = 0; i < people.size(); i++) {

            Person currentP = people.get(i);

            if(p.getHeight() > currentP.getHeight()) {
               removeIndex = i;
                p = currentP;

            }

        }

        people.remove(removeIndex);

        return p;

    }

    public static void main(String[] args) {

//        Room room = new Room();
//        System.out.println("Empty room? " + room.isEmpty());
//        room.add(new Person("Lea", 183));
//        room.add(new Person("Kenya", 182));
//        room.add(new Person("Auli", 186));
//        room.add(new Person("Nina", 172));
//        room.add(new Person("Terhi", 185));
//        System.out.println("Empty room? " + room.isEmpty());
//
//        System.out.println("");
//        for (Person person : room.getPersons()) {
//            System.out.println(person);
//        }

//        Room room = new Room();
//        System.out.println("Shortest: " + room.shortest());
//        System.out.println("Empty room? " + room.isEmpty());
//        room.add(new Person("Lea", 183));
//        room.add(new Person("Kenya", 182));
//        room.add(new Person("Auli", 186));
//        room.add(new Person("Nina", 172));
//        room.add(new Person("Terhi", 185));
//        System.out.println("Empty room? " + room.isEmpty());
//
//        System.out.println("");
//        for (Person person : room.getPersons()) {
//            System.out.println(person);
//        }
//
//        System.out.println();
//        System.out.println("Shortest: " + room.shortest());
//        System.out.println("");
//        for (Person person : room.getPersons()) {
//            System.out.println(person);
//        }

        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

    }

}
