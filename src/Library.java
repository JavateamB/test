/*Library.java has arrays, constructors, object creation, loops, string methods, method return
    encapsulation, method parameters by value, more print
*/

public class Library{

    private Book[] books;
    private int bookCount;

    //Very big constructor, makes the list of books available for user//
    public Library(){

        books = new Book[15];
        bookCount = 0;

        books[bookCount] = new Book("Percy Jackson", "Rick Riordan", "ISLS100");
        bookCount++;
        books[bookCount] = new Book("Animal Farm", "George Orwell", "ISLS101");
        bookCount++;
        books[bookCount] = new Book("Pride and Prejudice", "Jane Austen", "ISLS102");
        bookCount++;
        books[bookCount] = new Book("War and Peace", "Leo Tolstoy", "ISLS103");
        bookCount++;
        books[bookCount] = new Book("Oliver Twist", "Charles Dickens", "ISLS104");
        bookCount++;
        books[bookCount] = new Book("Moby Dick", "Herman Melville", "ISLS105");
        bookCount++;
        books[bookCount] = new Book("Iliad", "Homer", "ISLS106");
        bookCount++;
        books[bookCount] = new Book("The Odyssey", "Homer", "ISLS107");
        bookCount++;
        books[bookCount] = new Book("Hamlet", "William Shakespeare", "ISLS108");
        bookCount++;
        books[bookCount] = new Book("Things Fall Apart", "Chinua Achebe", "ISLS109");
        bookCount++;
        books[bookCount] = new Book("The Stranger", "Albert Camus", "ISLS110");
        bookCount++;
        books[bookCount] = new Book("Invisible Man", "Ralph Ellison", "ISLS111");
        bookCount++;
        books[bookCount] = new Book("Lone Survivor", "Marcus Luttrell", "ISLS112");
        bookCount++;
        books[bookCount] = new Book("The Republic", "Plato", "ISLS113");
        bookCount++;
        books[bookCount] = new Book("Oedipus The King", "Sophocles", "ISLS114");
        bookCount++;




    }

    //Method to list all the books in the array//
    public void listAllBooks(){
        for (int i = 0; i < bookCount; i++){
            System.out.println(books[i]);
        }
    }

    //Method to search for a specific book//
    public Book searchTitle(String title){
        for (int i=0; i<bookCount; i++) {
            //method from the string class (equalsIgnoreCase)//
            if (books[i].getTitle().equalsIgnoreCase(title)){
                return books[i];
            }
        }
        return null;
    }


    //Checking out a book//
    //method passing argument by a value (User user, String title)//
    public void checkBook(User user, String title){
        Book book = searchTitle(title);
        //operators ! and &&//
        if (book != null && book.isAvailable()){
            book.setAvailable(false);
            user.checkBook(book);
            System.out.println(book + "checked out successfully.");


        }else if (book == null) {
            System.out.println("book not found.");
        } else {
            System.out.println("Book is already checked out.");
        }


    }

    //returning a checked out book//
    public void returnBook(User user, String title) {
        Book book = searchTitle(title);
        if (book != null && user.hasBook(book)) {
            book.setAvailable(true);
            user.returnBook(book);
            System.out.println(book + "has been returned successfully.");
        } else {
            System.out.println(book + "not found or not checked out by this user.");
        }
    }


}
