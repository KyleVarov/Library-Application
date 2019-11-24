import java.util.*;

/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String title;
    
    private String author;
    
    private int catalogueNo;
    
    private Borrower borrower = new Borrower();
   
    
    public Book()
    {
        this.title = title;
        this.author = author;
        this.catalogueNo = catalogueNo;
        this.borrower = borrower;

    }
    
    public void setTitle(String t){
        t = title;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setAuthor(String a){
        a = author;
    }
}
