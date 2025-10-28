package level1.model;

import support.Input;

public class LibraryView {

    private LibraryManager libraryManager = new LibraryManager();

    public void run() {
        menu();
    }

    public void addBook() {
        String title = Input.readString("Enter book's title");
        String author = Input.readString("Enter book's author");
        boolean option = Input.yesOrno("Do you want to put the book in a certain position?");
        if (option) {

            try {
                int pos = Input.readInteger("Please, type the position");
                boolean success = libraryManager.addBookByPos(title, author, pos);
                if (success) {
                    System.out.println("Book added succesfully");
                }

            } catch (IndexOutOfBoundsException e) {
                System.err.println("Position not valid: " + e.getMessage());
            }

        } else {
            libraryManager.addBookByPos(title, author);
            System.out.println("Book added succesfully");
        }

    }

    public void removeBook() {
        String title = Input.readString("Enter the title of the book that you want to remove");

        boolean success = libraryManager.removeBook(title);
        if (success) {
            System.out.println("Book removed succesfully");
        } else {
            System.out.println("Book couldn't be deleted");
        }
    }

    public void printAllBooks() {
        libraryManager.printAllBooks();
    }

    public void getTitleByPos() {
        int posToSearch = Input.readInteger("Type the position of the book that you want to know the title");
        String title = libraryManager.getTitle(posToSearch);
        System.out.println("The title of the book in: " + posToSearch + " is " + title);
    }

    public void menu() {
        boolean runMenu = true;

        while (runMenu) {
            byte optionMenu = Input.readByte(printMenu());
            switch (optionMenu) {
                case 0:
                    System.out.println("Thanks for using the program");
                    runMenu = false;
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    printAllBooks();
                    break;
                case 3:
                    removeBook();
                    break;
                case 4:
                    getTitleByPos();
                    break;
                default:
                    System.out.println("Please, enter a valid option");
            }
        }


    }

    public String printMenu() {
        return "1. Add a new book\n" +
                "2. Print all books from library\n" +
                "3. Remove a book by title\n" +
                "4. Get book's title by position\n" +
                "0. Exit program\n";
    }
}