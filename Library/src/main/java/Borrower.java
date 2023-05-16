import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.borrowedBooks.add(book);
    }
}


