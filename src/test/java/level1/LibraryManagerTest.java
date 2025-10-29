package level1;
import level1.ex1.model.LibraryManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LibraryManagerTest {

    private LibraryManager libraryTester;

    @BeforeEach
    void SetUp(){
        libraryTester = new LibraryManager();
        }

    @Test
    void addNotNull() {
        libraryTester.addBook("A","B");
        assertNotNull(libraryTester.getBookList());
    }

    @Test
    void testAddMultipleBooks(){
        libraryTester.addBook("A","B");
        libraryTester.addBook("C","D");
        libraryTester.addBook("E","F");
        assertEquals(3,libraryTester.getBookList().size());

    }
    @Test
    void testAddBookChangesList(){
        int originalSize= libraryTester.getBookList().size();
        libraryTester.addBook("A","B");
        int newSize = libraryTester.getBookList().size();
        assertNotEquals(originalSize,newSize);

    }

    @Test
    void testBookAtSpecificPosition(){
        libraryTester.addBook("A", "B");
        libraryTester.addBook("C", "D");
        libraryTester.addBook("E", "F");
        assertEquals("C", libraryTester.getTitle(1));

    }

    @Test
    void testNoDuplicateBooks(){
        libraryTester.addBook("A","B");
        assertEquals(1, libraryTester.getBookList().size());

    }

    @Test
    void testGetTitle(){
        libraryTester.addBook("A", "B");
        assertEquals("A", libraryTester.getTitle(0));
    }

    @Test
    void testRemoveBookDecreasesSize(){
        libraryTester.addBook("A","B");
        int originalSize= libraryTester.getBookList().size();
        libraryTester.removeBook("A");
        int newSize = libraryTester.getBookList().size();
        assertEquals(originalSize -1,newSize);

    }
}

//Afegir tests per comprobar el ordre alfabetic es mante.