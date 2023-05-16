
import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> collection;

    public Library(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public void addBook(Book book) {
        if(this.countBooks() < this.capacity) collection.add(book);
    }

    public int countBooks(){
        return this.collection.size();
    }

    public void lend(Book book, Borrower borrower){
        // removes book form collection
        // calls borrow method from borrower
            // adds book to borrower.BorrowedBooks
    }
}
