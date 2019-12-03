
import java.util.*;

/**
 * Write a description of class Book here.
 *
 * @author (오시반데 관주2017630153, 테오 켄신2018771052, 호즈미 요시아키2018315054, 스피겔 크릴 2017605038)
 * @version (2019-11-29)
 */

public class Borrower

{

    private String name;

    private LinkedList<Loan> loanedBooks = new LinkedList<Loan>();

    

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

    public void attachLoan(Loan l){
        this.loanedBooks.add(l);

    }

    public void detachLoan(Loan l){
        this.loanedBooks.remove(l);
    }

    

}

