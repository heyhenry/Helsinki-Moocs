package Part_4;

public class Gauge {

    private int value;

    public Gauge() {

    }

    public void increase() {

        this.value = this.value + 1;

        if(this.value >= 5) {

            this.value = 5;

        }

    }

    public void decrease() {

        this.value = this.value - 1;

        if(this.value < 0) {

            this.value = 0;

        }

    }

    public int value() {

        return this.value;

    }

    public boolean full() {

        if(this.value == 5) {

            return true;

        } else {

            return false;

        }

    }

    public static void main(String[] args) {

        Gauge g = new Gauge();

        while(!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());

    }

}
