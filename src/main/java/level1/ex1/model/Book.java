package level1.model;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    //Posar un hashcode i un equals

    //moure LibraryManager i LibraryView de carpeta

    @Override
    public String toString() {
        return title + "," + author;
    }
}
