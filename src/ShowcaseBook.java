public class ShowcaseBook extends Book {
    public ShowcaseBook(String ISBN, String title, int year, String author) {
        super(ISBN, title, year, 0, author);
    }

    @Override
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: Showcase books are not for sale");
    }
}

