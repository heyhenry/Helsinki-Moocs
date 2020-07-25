package Part_4;

public class MainProgram {

    public static void main(String[] args) {

//        // Testing decrementing method works
//        Decreasing_Counter counter = new Decreasin_Counter(10);
//
//        counter.printValue();
//
//        counter.decrement();
//        counter.printValue();
//
//        counter.decrement();
//        counter.printValue();
//
//        // Ensuring counter value doesn't print negative values
//        Decreasing_Counter counter = new Decreasing_Counter(2);
//
//        counter.printValue();
//
//        counter.decrement();
//        counter.printValue();
//
//        counter.decrement();
//        counter.printValue();
//
//        counter.decrement();
//        counter.printValue();

        // Resetting counter value
        Decreasing_Counter counter = new Decreasing_Counter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();

    }

}
