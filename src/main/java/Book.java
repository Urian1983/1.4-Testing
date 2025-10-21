public class Book {

    private String title;
    private String author;

    public Book(String titleBook, String authorBook) {
        this.title = titleBook;
        this.author= authorBook;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return getTitle() + "," +getAuthor();
    }
}

