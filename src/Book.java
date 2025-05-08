public class Book {
    public String title; //public added for realism
    public String author;
    public boolean available;

    public Book(String t, String a) {
        title = t;
        author = a;
        available = true;
    }

    public Book(String t) {
        this(t,"Author Unkown"); //overloading constructor

    }

    public boolean matches(String keyword) {
        return title.toLowerCase().contains(keyword.toLowerCase());
        //^^String Class method
    }

    public String toString() {
        String status = available ? "Available" : "Checked Out";
        return title + " by " + author + "(" + status + ")";
    }
}