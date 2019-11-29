
import java.util.*;

/**
 * Write a description of class Book here.
 *
 * @author (오시반데 관주2017630153, 테오 켄신2018771052, 호즈미 요시아키2018315054, 키릴)
 * @version (2019-11-29)
 */

public class Borrower

{

    private String name;

    private LinkedList<Book> borrowedBooks = new LinkedList<Book>();

    private Loan loan;

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

    public void AttachLoan(Loan l){

        this.loan = l;

    }

    public void detachLoan(){
        this.loan = null;
    }

    public Loan getLoanInfo(){

        return this.loan;

    }

}

