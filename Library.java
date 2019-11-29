import java.util.*;

/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private String name;

    public TreeSet<Book> registeredBook;
    public HashSet<Borrower> registeredBorrowers;
    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        String name = this.name;
    }
    
    public String toString(){
        return "Library name: " + this.name;
    }
    
    public void RegisterOneBorrower(String name){
        Borrower borrower = new Borrower(name); 
        registeredBorrowers.add(borrower);
    }

    public void RegisterOneBook(String title, String author,int catalogueNo){
        Book book = new Book(title,author,catalogueNo);
        registeredBook.add(book);
    }

    public void DisplayBookForLoan(){
        Iterator it = registeredBook.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            if(book.getBorrower() == null){
                book.display();
            }
        }
    }

    public void DisplayBooksOnLoan(){
        
    }

    public void LendOneBook (String name, int catalogueNo){
        Book book = this.searchBook(catalogueNo);
        Borrower borrower = this.searchBorrower(name);
        if(book!=null&& borrower!= null){
            book.attachBorrower(borrower);
            borrower.attachBook(book);
        }
        else if(book == null){
            System.out.println("책을 찾을 수 없음");
        }
        else if(borrower == null){
            System.out.println("이용자를 찾을 수 없음");
        }
    }
   
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void checkSameName(String name){
        Iterator it = registeredBorrowers.iterator();
        while(it.hasNext()){
            Borrower borrower = (Borrower)it.next();
            if(borrower.getName() == name){
                System.out.println("등록 할 수 있는 이름이다");
                break;
            }
            else{
                System.out.println("등록 할 수 없는 이름이다");
                break;
            }
        }
        
        
    }
    
    public void addBook(){
    }
    
    public void addBorrower(Borrower b){
        //hashset?
    }
    
    public void checkInformation(int catalogueNo){
        
    }

    public Book searchBook(int catalougeNo){
        Iterator it = registeredBook.iterator();
        
        Book bookFound = null;
        while(it.hasNext()){
            Book book = (Book)it.next();
            if(book.getCatalogueNo() == catalougeNo){
                bookFound = book;
            }
        }
        return bookFound;
    }
    
    public Borrower searchBorrower(String name){
        Iterator it = registeredBorrowers.iterator();
         
        Borrower borrowerFound = null;
        while(it.hasNext()){
            Borrower borrower = (Borrower)it.next();
            if(borrower.getName() == name){
                return borrower = borrowerFound;
            }
        }
        return borrowerFound;
    }
    
}
