package lab2;

public class MaliciousClient {
    public boolean checkBookLent(Library lib) throws CloneNotSupportedException {                
        Book book = lib.getBook();
        book.setLent(true);        
        return book.isLent();
    }
}
