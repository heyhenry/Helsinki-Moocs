package Part_5;

public class Counter {

    private int startValue;

    public Counter(int startValue) {

        this.startValue = startValue;

    }

    public Counter() {

        this.startValue = 0;

    }

    public int value() {

        return startValue;

    }

    public void increase() {

        startValue = startValue + 1;

    }

    public void increase(int increaseBy) {

        if(increaseBy < 0) {


        } else {

            startValue = startValue + increaseBy;

        }

    }

    public void decrease() {

        startValue = startValue - 1;

    }

    public void decrease(int decreaseBy) {

        if(decreaseBy < 0) {


        } else {

            startValue = startValue - decreaseBy;

        }

    }

    public String toString() {

        return "The start value is now: " + startValue;

    }

    public static void main(String[] args) {

        Counter c = new Counter(5);

        c.increase();
        System.out.println(c);
        c.increase();
        System.out.println(c);
        c.decrease();
        System.out.println(c);

        c.decrease(-30);
        System.out.println(c);

        c.increase(-50);
        System.out.println(c);

    }

}
