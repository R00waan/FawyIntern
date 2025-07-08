import java.util.*;

public class QuantumBookstore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getISBN(), book);
        System.out.println("Quantum book store: Book added  " + book.toString());
    }

    public Book removeOutdatedBook(int currYear, int mxage) {
        Iterator<Map.Entry<String, Book>> itr = inventory.entrySet().iterator();
        while (itr.hasNext()) {
            Book book = itr.next().getValue();
            if (currYear - book.getYear() > mxage) {
                itr.remove();
                System.out.println("Quantum book store: Removed outdated book " + book.getISBN());
                return book;
            }
        }
        return null;
    }

    public float buyBook(String ISBN, int quantity, String email, String address) {
        Book book = inventory.get(ISBN);
        if (book == null) {
            throw new IllegalArgumentException("Quantum book store: Book with ISBN not found");
        }

        if (book instanceof ShowcaseBook) {
            throw new IllegalArgumentException("Quantum book store: Cannot buy a showcase book");
        }

        if (book instanceof PaperBook) {
            PaperBook pb = (PaperBook) book;
            pb.reduceStock(quantity);
        }

        float total = book.price * quantity;
        book.deliver(email, address);
        System.out.println("Quantum book store: Paid amount = " + total);
        return total;
    }
}
