//User class has inheritance, super keyword, encapsulation, abstraction method//

import java.util.ArrayList;
import java.util.List;

/**
 * User class inherits the Person class
 * used for the user's transactions in the library
 */
public class User extends Person{
    private String name;
    private List<Book> checkedOutBooks;

    /**
     * sets the current user to the name given
     * @param name a string holding the current user's name
     */
    public User(String name) {

        super(name);
        this.checkedOutBooks = new ArrayList<>();
    }

    /**
     * method overidden from the Person class, displays user's permissions
     * @return string value holding the permission of the user
     */
    @Override
    public String getPerm(){
        return "User permissions";
    }

    /**
     * getter method to get the name of the user
     * @return string value of the users name
     */
    public String getName() {

        return name;
    }

    /**
     * method to checkout a book for a user
     * @param book the book that a user wants to checkout
     */
    public void checkBook(Book book) {

        checkedOutBooks.add(book);
    }

    /**
     * method to check if a user has already checked out a book
     * @param book the book that is being checked
     * @return true or false depending on if the book has already been checked out
     */
    public boolean hasBook(Book book) {

        return checkedOutBooks.contains(book);
    }

    /**
     * method used for a user to return a book
     * @param book the name of the book the user is trying to return
     */
    public void returnBook(Book book) {

        checkedOutBooks.remove(book);
    }

    /**
     * string manipulation method, used to return the current user
     * @return a string that displays the current user
     */
    @Override
    public String toString() {
        return "User: " + name;
    }
}
