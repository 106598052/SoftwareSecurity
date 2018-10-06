package lab2;

public class NormalClient {

    public boolean checkBookLent(Library lib) throws CloneNotSupportedException {
        return lib.getBook().isLent();       
    }
}
