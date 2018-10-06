package lab2;
public class Library {

    private Book book;

    public Library() {
        book = new Book();
    }

    public Book getBook() throws CloneNotSupportedException {
        return this.book.copy();
    }
}
