package Part_5;

public class Timer {

    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;
    private int hundrethSecond; // ?

    public Timer() {

        this.hours = new ClockHand(24);
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
        this.hundrethSecond = 0;

    }

    public void advance() {

        this.hundrethSecond = this.hundrethSecond + 1;

        if(this.hundrethSecond >= 100) {

            this.hundrethSecond = 0;
            this.seconds.advance();

        }

    }

    public String toString() {

        return seconds + " : " + hundrethSecond;

    }

    public static void main(String[] args) {

        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }

    }

}
