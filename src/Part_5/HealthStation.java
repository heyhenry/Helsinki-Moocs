package Part_5;

public class HealthStation {

    private int weighCounter;

    public HealthStation() {

    }

    public int weigh (Person person) {

        weighCounter++;
        return person.getWeight();

    }

    public void feed(Person person) {

        person.setWeight(person.getWeight() + 1);

    }

    public int weighings() {

        return weighCounter;

    }

    public static void main(String[] args) {

//        HealthStation childrensHospital = new HealthStation();
//
//        Person ethan = new Person("Ethan", 1, 110, 7);
//        Person peter = new Person("Peter", 33, 176, 85);
//
//        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
//        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
//
//        childrensHospital.feed(ethan);
//        childrensHospital.feed(ethan);
//        childrensHospital.feed(ethan);
//
//        System.out.println("");
//
//        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
//        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");

        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrensHospital.weighings());

    }

}
