package Part_4;

public class Whistle {

    private String sound;

    public Whistle(String whistleSound) {

        sound = whistleSound;

    }

    public void sound() {

        System.out.println(sound);

    }

    public static void main(String[] args) {

        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();

    }

}
