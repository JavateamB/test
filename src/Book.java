/**
 * Book class is used to construct the actual "library" of books
 * Stores basic info about the books (title and author)
 * @author Griffin
 */

public class Book {
    public String title; //public added for realism
    public String author;
    public boolean available;

    /**
     * Constructs a new book given the title and author
     * @param t title of book
     * @param a author of book
     */
    public Book(String t, String a) {
        title = t;
        author = a;
        available = true;
    }

    /**
     * Overloading of the Book constructor, using only the param t
     * @param t once again, title of the book
     */
    public Book(String t) {
        this(t,"Author Unkown"); //overloading constructor

    }

    /**
     *
     * @param keyword the word used to search for the title in book array
     * @return true or false if the keyword matches the title
     */
    public boolean matches(String keyword) {
        return title.toLowerCase().contains(keyword.toLowerCase());
        //^^String Class method
    }

    /**
     * toString method is made to print the availability of a book
     * @return a string that explains availability of book
     */
    public String toString() {
        String status = available ? "Available" : "Checked Out";
        return title + " by " + author + "(" + status + ")";
    }
}