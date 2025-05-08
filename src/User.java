//User class has inheritance, super keyword, encapsulation, abstraction method//

import java.util.ArrayList;
import java.util.List;

//Inheritance extends keyword//
public class User extends Person{
    private String name;
    private List<Book> checkedOutBooks;

    public User(String name) {
        //super keyword//
        super(name);
        this.checkedOutBooks = new ArrayList<>();
    }

    //abstraction for the getPerm method from Person class//
    @Override
    public String getPerm(){
        return "User permissions";
    }

    public String getName() {
        return name;
    }

    // Method to check out a book
    public void checkBook(Book book) {
        checkedOutBooks.add(book);
    }

    // Method to check if user has a specific book
    public boolean hasBook(Book book) {
        return checkedOutBooks.contains(book);
    }

    // Method to return a book
    public void returnBook(Book book) {
        checkedOutBooks.remove(book);
    }

    @Override
    public String toString() {
        return "User: " + name;
    }
}
