public class EBook extends Book {
    private String fileType;

    public EBook(String ISBN, String title, int year, float price, String author, String fileType) {
        super(ISBN, title, year, price, author);
        this.fileType = fileType;
    }

    @Override
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: Sending EBook to email: " + email);

    }
}
