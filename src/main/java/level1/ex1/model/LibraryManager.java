package level1.ex1.model;

import java.util.*;

//Crear algoritme per ordenar alfabeticament els llibres.

public class LibraryManager {

   private Set<Book> bookList = new LinkedHashSet<>();

   public void addBook(String title, String author){
        Book newBook = new Book(title,author);
        bookList.add(newBook);
    }

    public void printAllBooks(){
        bookList.forEach(System.out::println);
    }

    public Set<Book> getBookList(){
        return bookList;
    }

    public String getTitle (int pos) {
        List<Book> books = new ArrayList<>(bookList);
        if (bookList.isEmpty()) {
            return "Library is empty";
        }

        if(pos<0 || pos>=books.size()){
            return "position not valid";
        }

        try {
            String titleToGet = books.get(pos).getTitle();
            return titleToGet;
        } catch (IndexOutOfBoundsException e) {
            return "invalid position" + pos;
        }

    }

    public boolean addBookByPos(String title, String author, int pos) {

        List<Book> books = new ArrayList<>(bookList);

        Book newBook = new Book(title, author);
        books.add(pos, newBook);
        bookList.clear();
        return bookList.addAll(books);
    }

    public boolean removeBook(String title){
        if(bookList.isEmpty()) {
            System.out.println("Library is empty");
            return false;
        }

        return bookList.removeIf(book -> book.getTitle().equals(title));
        }

    public void sortBooksByTitle() {
        List<Book> books = new ArrayList<>(bookList);
        books.sort(Comparator.comparing(Book::getTitle));
        bookList.clear();
        bookList.addAll(books);
    }
    }



