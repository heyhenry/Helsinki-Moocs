package Part_4;

public class Agent {

    private String firstName;
    private String lastName;

    public Agent(String initialFirstName, String initialLastName) {

        this.firstName = initialFirstName;
        this.lastName = initialLastName;

    }

    public void print() {

        System.out.println("My name is " + lastName + ", " + firstName + " " + lastName);

    }

    public static void main(String[] args) {

        Agent bond = new Agent("James", "Bond");
        bond.print();

    }


}
