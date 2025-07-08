public class PaperBook extends Book {
    private int stock;

    public PaperBook(String ISBN, String title, int year, float price, String author, int stock) {
        super(ISBN, title, year, price, author);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        if (stock < quantity) {
            throw new IllegalArgumentException("Quantum book store: Not enough stock for ISBN " + ISBN);
        }
        stock -= quantity;
    }

    @Override
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: Sending PaperBook to address: " + address);

    }
}
