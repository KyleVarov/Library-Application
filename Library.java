
import java.util.*;

/**
 * Write a description of class Library here.
 *
 * @author (오시반데 관주2017630153, 테오 켄신2018771052, 호즈미 요시아키2018315054, 스피겔 크릴 2017605038)
 * @version (2019-11-29)
 */
public class Library
{
    private String name;

    public TreeSet<Book> registeredBook;

    public HashSet<Borrower> registeredBorrowers;

    public HashSet<Loan> bookLoans;

    /**

     * Constructor for objects of class Library

     */

    public Library()

    {

        String name = this.name;
        registeredBorrowers = new HashSet<Borrower>();
        registeredBook = new TreeSet<Book>();
        bookLoans = new HashSet<Loan>();
    }

    public String toString(){
        return "Library name: " + this.name;
    }

    public void registerOneBorrower(String name){
        if ((registeredBorrowers.size()) > 0){
            checkSameName(name);
        }
        else{
            Borrower newBorrower = new Borrower(name);
            addBorrower(newBorrower);
            System.out.println("'"+ newBorrower.getName() + "' has been successfully added.");
        }
    }

    public void registerOneBook(String title, String author,int catalogueNo){
        if ((registeredBook.size()) > 0){
            checkInformation(title,author,catalogueNo);
        }
        else{
            Book newBook = new Book(title,author,catalogueNo);
            addBook(newBook);
            System.out.println("'"+ newBook.getTitle() + "' has been successfully added.");
        }
    }

    public void displayBookForLoan(){

        Iterator it = registeredBook.iterator();

        while(it.hasNext()){

            Book book = (Book)it.next();

            if(book.getLoanInfo() == null){

                System.out.println(book.display()+"\n"+"----------------");

            }

        }

    }

    public void displayBooksOnLoan(){
        Iterator it = registeredBook.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            if(book.getLoanInfo() != null){
                System.out.println(book.display());
                System.out.println("borrower: " + book.getLoanInfo().getBorrower().getName());
                System.out.println("----------------");
            }
        }
    }

    public void lendOneBook (String name, int catalogueNo, String borrowDate, String returnDate){

        Book book = this.searchBook(catalogueNo);

        Borrower borrower = this.searchBorrower(name);

        if(book!=null&& borrower!= null){
            Loan newLoan = new Loan(borrowDate, returnDate, book, borrower);
            newLoan.setBorrower(borrower);
            newLoan.setBook(book);
            book.attachLoan(newLoan);
            borrower.attachLoan(newLoan);
            bookLoans.add(newLoan);
            System.out.println("'"+ book.getTitle()+"' has been borrowed");
            
        }

        else if(book == null){
            System.out.println("book cannot be found");
        }

        else if(borrower == null){
            System.out.println("borrower cannot be found"); 
        }

    }

    public void returnOneBook(int catalogueNo){  

        Loan loan = searchForLoan(catalogueNo);
        if (loan == null){
            System.out.println("Loan Object could not be found");
        }else{
            loan.getBook().detachLoan();
            loan.getBorrower().detachLoan(loan);
            System.out.println("'"+loan.getBook().getTitle()+"' has been returned"); 
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
                System.out.println("Borrower is already registered");
                break;
            }
            else{

                addBorrower(new Borrower(name));
                break;
            }
        }
    }

    public void addBook(Book b){
        registeredBook.add(b);

    }

    public void addBorrower(Borrower b){
        registeredBorrowers.add(b);
    }

    public void checkInformation(String title, String author,int catalogueNo){
        Iterator it = registeredBook.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            if(book.getCatalogueNo() == catalogueNo){
                System.out.println("book is already registered");
                break;
            }
            else{
                addBook(new Book(title,author,catalogueNo));
                break;

            }

        }

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

                return borrowerFound = borrower;

            }

        }

        return borrowerFound;

    }

    public void addLoanToCollection(Loan loan){
        bookLoans.add(loan);
    }

    public Loan searchForLoan(int catalogueNo){
        Iterator it = bookLoans.iterator();
        Loan loan = null;
        while(it.hasNext()){
            Loan searchLoan = (Loan)it.next();
            if(searchLoan.getBook().getCatalogueNo() == catalogueNo){
                loan = searchLoan;
                break;
            }
        }
        return loan;
    }
}

