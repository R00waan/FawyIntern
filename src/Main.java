public class Main {
    public static void main(String[] args) {
        QuantumBookstore store = new QuantumBookstore();

        Book paper = new PaperBook("001", "Java Basics", 2019, 100, "John Smith", 10);
        Book ebook = new EBook("002", "AI Guide", 2022, 600, "Alice Booby Brown", "PDF");
        Book showcase = new ShowcaseBook("003", "History 101", 2015, "Jane Doe");

        store.addBook(paper);
        store.addBook(ebook);
        store.addBook(showcase);

        store.removeOutdatedBook(2025, 10);

        store.buyBook("001", 2, "u895@examp.com", "Cairo, Egypt");
        store.buyBook("002", 1, "u123@examp.com", "");

    }
}