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
    }

    public void RegisterOneBook(String name){}

    public void DisplayBookForLoan(){}

    public void DisplayBooksOnLoan(){}

    public void LendOneBook (String name, int catalogueNo){}
    
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void CheckSameName(String name){}
    
    public void addBook(){}
    
    public void checkInformation(int catalogueNo){}
    
    public void SearchBook(int catalogueNo){}
    
    
    
}
