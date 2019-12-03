
/**
 * Write a description of class Book here.
 *
 * @author (오시반데 관주2017630153, 테오 켄신2018771052, 호즈미 요시아키2018315054, 스피겔 크릴 2017605038)
 * @version (2019-11-29)
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

