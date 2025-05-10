//User class has inheritance, super keyword, encapsulation, abstraction method//

import java.util.ArrayList;
import java.util.List;


public class User extends Person{
    private String name;
    private List<Book> checkedOutBooks;

    public User(String name) {

        super(name);
        this.checkedOutBooks = new ArrayList<>();
    }


    @Override
    public String getPerm(){
        return "User permissions";
    }

    public String getName() {

        return name;
    }


    public void checkBook(Book book) {

        checkedOutBooks.add(book);
    }


    public boolean hasBook(Book book) {

        return checkedOutBooks.contains(book);
    }


    public void returnBook(Book book) {

        checkedOutBooks.remove(book);
    }

    @Override
    public String toString() {
        return "User: " + name;
    }
}
