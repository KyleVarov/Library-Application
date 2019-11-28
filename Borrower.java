import java.util.*;

/**
 * Write a description of class Borrower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Borrower
{
    // Borrower class 자체가 HashSet인가 아니면 HashSet을 가지고 있나??
    private String name;
    private LinkedList<Book> borrowedBooks = new LinkedList<Book>();
    
    
    public Borrower(String name)
    {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public Borrower searchBorrower(Borrower b){
        return b; //먼저 hashset을 검색해야 된다.
    }
    
    public void attachBook(Book b){
        borrowedBooks.add(b);
    }
    public void detachBook(Book b){
        borrowedBooks.remove(b);
    }

}
