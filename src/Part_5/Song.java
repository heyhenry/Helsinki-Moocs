package Part_5;

public class Song {

    private String artist;
    private String title;
    private int id;

    public Song(String artist, String title, int id) {

        this.artist = artist;
        this.title = title;
        this.id = id;

    }

    public boolean equals(Song isEqual) {

        if(this == isEqual) {

            return true;

        }

        if(!(isEqual instanceof Song)) {

            return false;

        }

        if(this.artist.equals(isEqual.artist) &&
                this.title.equals(isEqual.title) &&
                this.id == isEqual.id) {

            return true;

        }

        return false;

    }

    public static void main(String[] args) {

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }

    }

}
