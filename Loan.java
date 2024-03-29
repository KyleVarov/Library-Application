
/**
 * Loan 클래스는 대출에 대한 정보를 가지며 Borrower와 Book 객체를 서로 연결하는 클래스이다. 
 *
 * @author (오시반데 관주2017630153, 테오 켄신2018771052, 호즈미 요시아키2018315054, 스피겔 크릴 2017605038)
 * @version (2019-12-03)
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

