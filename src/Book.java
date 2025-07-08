public abstract class Book {
    protected String ISBN;
    protected String title;
    protected int year;
    protected float price;
    protected String author;

    public Book(String ISBN, String title, int year, float price, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYear() {
        return year;
    }

    public abstract void deliver(String email, String address);

    public String toString() {
        return "Quantum book store: ISBN=" + ISBN + ", Title=" + title + ", Year=" + year + ", Price=" + price + ", Author=" + author;
    }
}
