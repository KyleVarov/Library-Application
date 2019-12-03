import java.util.*;

/**
 * Book 클래스는 Library 클래스에 속하는 고유한 수장자료이며 Borrower한테 대출 및 반납될 수 있는 객체이다 
 *
 * @author (오시반데 관주2017630153, 테오 켄신2018771052, 호즈미 요시아키2018315054, 스피겔 크릴 2017605038)
 * @version (2019-12-03)
 */
public class Book implements Comparable<Book>
{
    private String title;
    private String author;
    private int catalogueNo;
    private Loan loan;

    public Book(String title, String author,int catalogueNo)

    {

        this.title = title;

        this.author = author;

        this.catalogueNo = catalogueNo;

    }

    

    public String display(){
        return "title: "+ this.title +"\n"+ "author: " + this.author +
        "\n"+"catalogue number: "+ String.valueOf(this.catalogueNo);
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

    public void attachLoan(Loan l){ 
        this.loan = l;
    }

    public void detachLoan(){
        this.loan = null;
    }

    public Loan getLoanInfo(){
        return this.loan;
    }
    
    public int compareTo(Book other){
        return Integer.compare(this.catalogueNo, other.catalogueNo);
    }
}

