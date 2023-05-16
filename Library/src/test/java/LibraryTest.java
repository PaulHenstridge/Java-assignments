import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    @Before
    public void before(){
        library = new Library(4);
        Book book1 = new Book("FLapping", "Flappy Pete", "Fiction");
        Book book2 = new Book("Murder for dummies", "Stabby Pete", "Self help");
        Book book3 = new Book("Gin recipes", " Granny Jean", "cookery");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void hasBooks(){
    assertEquals(3, library.countBooks());
    }

    @Test
    public void canAddBook() {
        Book book4 = new Book("fighting Ducks ", " Steve Quackattack", "hobbies");
        library.addBook(book4);
        assertEquals(4,library.countBooks());
    }

    @Test
    public void cannotAddIfFull() {
        Book book4 = new Book("fighting Ducks ", " Steve Quackattack", "hobbies");
        Book book5 = new Book("Snow", " Steve Snow", "non fiction");
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4, library.countBooks());
    }
}
