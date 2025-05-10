import java.util.*;

/**
 * Library class includes list of books and all user functionality methods
 * @author Lucas
 *
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    /**
     * Adds new book titles and authors to the book array
     * @author Lucas
     * @see Book
     */
    public Library() {
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("Hamlet", "Shakespeare" ));
        books.add(new Book("Moby Dick", "Melville"));
        books.add(new Book("The Republic", "Plato"));
        books.add(new Book("The Odyssey", "Homer"));
        books.add(new Book("Iliad", "Homer"));
    }

    /**
     * Method that lists all books in the library for the user to see
     */
    public void listAllBooks() {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b != null) {
                System.out.println((i + 1) + ". " + b.toString());
            }
        }
    }

    /**
     * Method that allows the user to search for a specific book using title
     * @param t the title of the book searched
     * @return the matching book with this title
     */
    public Book searchTitle(String t) {
        for (Book b : books) {
            if (b.matches(t)) {
                return b;
            }
        }
        return null;
    }

    /**
     * method for a user to checkout a book. Prints the result
     * of the attempted checkout.
     * @see Main
     * @param user the user that is currently logged in
     * @param title the title of the book attempting to be checked out
     */
    public void checkBook(User user, String title) {
        Book b = searchTitle(title);
        if (b == null) {
            System.out.println("Sorry. Book doesn't exist.");
            return;
        }
        if (!b.available) {
            System.out.println("Already borrowed.");
            return;
        }
        b.available = false;
        user.checkBook(b);
        System.out.println("Book checked out!");
    }

    /**
     * method for the user to return a book previously checked out.
     * checks if book was actualy checked out and the status
     * @param user user that is logged in and attempting to return a bok
     * @param title title of the book that is being returned
     */
    public void returnBook(User user, String title) {
        Book b = searchTitle(title);
        if (b == null || !user.hasBook(b)) {
            System.out.println("Can't return. Maybe wrong book?");
            return;
        }
        b.available = true;
        user.returnBook(b);
        System.out.println("Book returned successfully.");
    }

    /**
     * method to return the size of the library (books array)
     * @return integer of the number of books in books array
     */
    public int getBookCount() {
        return books.size();
    }

    /**
     * getter method used to get a book by its index in the array
     * If index is out of bounds, it returns null to avoid errors
     *
     * @param index index of the book in the array
     * @return the book at the provided index, or null as a fallback
     */
    public Book getBookByIndex(int index) {
        if (index < books.size()) {
            return books.get(index);
        } else {
            return null; // graceful fallback if needed lol
        }
    }
}

