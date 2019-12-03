import java.util.*;

/**
 * Write a description of class Library here.
 *
 * @author (오시반데 관주2017630153, 테오 켄신2018771052, 호즈미 요시아키2018315054, 키릴)
 * @version (2019-11-29)
 */
public class Library
{
    private String name;

    public TreeSet<Book> registeredBook;

    public HashSet<Borrower> registeredBorrowers;
    
    public TreeSet<Loan> bookLoans;

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
        CheckSameName(name);

    }

    public void RegisterOneBook(String title, String author,int catalogueNo){
        Book book = new Book(title,author,catalogueNo);
        registeredBook.add(book);
    }

    public void DisplayBookForLoan(){

        Iterator it = registeredBook.iterator();

        while(it.hasNext()){

            Book book = (Book)it.next();

            if(book.getLoanInfo() == null){

                book.display();

            }

        }

    }

    public void DisplayBooksOnLoan(){
        Iterator it = registeredBook.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            if(book.getLoanInfo() != null){
                book.display();
            }
        }
    }
    public void LendOneBook (String name, int catalogueNo, String borrowDate, String returnDate){

        Book book = this.searchBook(catalogueNo);

        Borrower borrower = this.searchBorrower(name);

        if(book!=null&& borrower!= null){
            Loan newLoan = new Loan(borrowDate, returnDate, book, borrower);
            newLoan.setBorrower(borrower);
            newLoan.setBook(book);
            book.AttachLoan(newLoan);
            borrower.AttachLoan(newLoan);
        }

        else if(book == null){
            System.out.println("책을 찾을 수 없음");
        }

        else if(borrower == null){
            System.out.println("이용자를 찾을 수 없음");
        }

    }

    public void ReturnOneBook(String name, int catalogueNo){
        // Book book = this.searchBook(catalogueNo);
        // Borrower borrower = this.searchBorrower(name);
        // if(book!=null&& borrower!= null){
            // book.detachLoan();
            // borrower.detachLoan();
        // }
        // else if(book == null){
            // System.out.println("책을 찾을 수 없음");
        // }
        // else if(borrower == null){
            // System.out.println("이용자를 찾을 수 없음");
        // }
        Iterator it = bookLoans.iterator();
        Loan loan = searchForLoan(catalogueNo);
        if (loan == null){
            System.out.println("Loan Object could not be found");
        }else{
            loan.getBook().detachLoan();
            loan.getBorrower().detachLoan();
            System.out.println("'"+loan.getBook().getTitle()+"' has been returned"); 
        }
    }

    public String getName(){

        return this.name;

    }

    public void setName(String name){
        this.name = name;
    }

    public void CheckSameName(String name){
        Iterator it = registeredBorrowers.iterator();
        while(it.hasNext()){
            Borrower borrower = (Borrower)it.next();
            if(borrower.getName() == name){
                addBorrower(new Borrower(name));
                break;
            }
            else{
                System.out.println("이미 등록한 대체자이다");
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
        Iterator it = registeredBorrowers.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            if(book.getCatalogueNo() == catalogueNo){
                addBook(new Book(title,author,catalogueNo));
                break;
            }
            else{
                System.out.println("이미 등록한 책이다");
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

                return borrower = borrowerFound;

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
            Loan searchloan = (Loan)it.next();
            if(loan.getBook().getCatalogueNo() == catalogueNo){
                loan = searchloan;
                break;
            }
        }
        return loan;
    }
}
 
