package Part_5;

public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;
    SimpleDate date;

//    public Person(String name) {
//        this(name, 0, 0, 0);
//    }

    public Person(String name, SimpleDate date, int weight, int age) {

        this.name = name;
        this.date = date;
        this.weight = weight;
        this.age = age;

    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public boolean equals(Object compared) {

        if(this == compared) {

            return true;

        }

        if(!(compared instanceof Person)) {

            return false;

        }

        Person comparedPerson = (Person) compared;

        if(this.name.equals(comparedPerson.name) && this.weight == comparedPerson.weight && this.age == comparedPerson.age) {

            return true;

        }

        return false;

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {

        return this.weight;

    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public static void main(String[] args) {

//        Person p = new Person("Okidi");
//
//        p = null;
//        p.growOlder();

        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);
        SimpleDate date3 = new SimpleDate(24, 3, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);
        Person lilith = new Person("Leo", date2, 62, 9);

        if (leo.equals(lily)) {

            System.out.println("Is this quite correct?");

        } else {

            System.out.println("Ofc, leo won't equal lily.");

        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");

        } else {

            System.out.println("Ofc, leo won't equal leo with a different weight.");

        }

        if(leo.equals(lilith)) {

            System.out.println("It equals because their stats equal.");

        } else {

            System.out.println("It doesn't equal because their stats don't equal.");

        }

    }
}