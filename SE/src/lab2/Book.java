package lab2;
public class Book {
    
    private boolean lent = false;
        
    public boolean isLent() {
        return lent;
    }

    public void setLent(boolean lent) {
        this.lent = lent;
    }   
    
    public Book copy(){
    	Book cBook = new Book();
    	cBook.setLent(this.lent);
    	return cBook;
    }
}
