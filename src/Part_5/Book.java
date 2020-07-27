package Part_5;

public class Book {

    private String author;
    private String title;
    private int pages;

    public Book(String initialAuthor, String initialTitle, int initialPages) {

        this.author = initialAuthor;
        this.title = initialTitle;
        this.pages = initialPages;

    }

    public String getAuthor(){

        return author;

    }

    public String getTitle(){

        return title;

    }

    public int getPages(){

        return pages;

    }

    public String toString() {

        return getAuthor() + ", " + getTitle() + ", " + getPages() + " pages";

    }

    public static void main(String[] args) {

        Book b = new Book("J. K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);

        System.out.println(b);

    }

}
