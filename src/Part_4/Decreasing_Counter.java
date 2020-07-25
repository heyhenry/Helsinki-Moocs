package Part_4;

public class Decreasing_Counter {

    private int value;

    public Decreasing_Counter(int initialValue) {

        this.value = initialValue;

    }

    public void printValue() {

        System.out.println("value: " + this.value);

    }

    public void decrement() {

        this.value = this.value - 1;

        if(this.value < 0) {

            this.value = 0;

        }

    }

    public void reset() {

        this.value = 0;

    }

}
