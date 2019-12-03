
/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    private String borrowDate;
    private String returnDate;
    private Book book;
    private Borrower borrower;
    
    public Loan(String borrowd, String returnd, Book b, Borrower borrower)
    {
        this.borrowDate = borrowd;
        this.returnDate = returnd;
        this.book = b;
        this.borrower = borrower;
    }
    
    public String toString(){
        
        return "borrow date: "+ this.borrowDate +"\n"+ 
        "return date: " + this.returnDate +"\n"+ "Book: "+ String.valueOf(this.book.getCatalogueNo())
        +"\n"+ "borrower: " + this.borrower.getName();
    }
    
    public Book getBook(){
        return this.book;
    }
    
    public void setBook(Book book){
        this.book = book;
    }
    
    public Borrower getBorrower(){
        return this.borrower;
    }
    
    public void setBorrower(Borrower borrower){
        this.borrower = borrower;
    }
    
}
