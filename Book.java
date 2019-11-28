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
    private Borrower borrower;
    
    public Book()
    {
        this.title = title;
        this.author = author;
        this.catalogueNo = catalogueNo;
        

    }
    
    public String toString(){
        
        return "title: "+ this.title +"\n"+ "author: " + this.author + 
        "\n"+"catalogue number: "+ String.valueOf(this.catalogueNo)
        +"\n"+ "borrower: " + this.borrower.getName();
    }   
    
    public void setTitle(String t){
        this.title = t;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setAuthor(String a){
        this.author = a;
    }
    public String getAuthor(){
        return this.author;
    }
    
    public int getCatalogueNo(){
        return this.catalogueNo;
    }
    
    public void setCatalogueNo(int cn){
        this.catalogueNo = cn;
    }
    
    //public Book searchBook(Book b){}
    
    public void attachBorrower(Borrower b){
        this.borrower = b;
    }
    public void detachBorrower(){
        this.borrower = null;
    }
}
