import java.util.*;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("Hamlet", "Shakespeare" ));
        books.add(new Book("Moby Dick", "Melville"));
        books.add(new Book("The Republic", "Plato"));
        books.add(new Book("The Odyssey", "Homer"));
    }

    public void listAllBooks() {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b != null)
                System.out.println((i + 1) + ". " + b.toString());
        }
    }

    public Book searchTitle(String t) {
        for (Book b : books) {
            if (b.matches(t)) return b;
        }
        return null;
    }

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

    public int getBookCount() {
        return books.size();
    }

    public Book getBookByIndex(int index) {
        if (index < books.size()) {
            return books.get(index);
        } else {
            return null; // graceful fallback if needed lol
        }
    }
}

