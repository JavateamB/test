
/*This Main.java file contains a Scanner class, do-while loop, switch statement, logical operators
  println, method calling, and object creation
*/


/**
 * This a main class to test Person.java
 *
 * @author Shiva Sharma
 * @version 1.0
 * @see Book
 */

import java.util.*;

public class Main {

    /**
     * This is a main method
     *
     * @param args stores incoming the command line arg for the program
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Library library = new Library();

        int choice;
        do {

            System.out.println("\n===== Library Menu =====");
            System.out.println("1. List all books");
            System.out.println("2. Search for a book");
            System.out.println("3. Checkout a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    library.listAllBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to search: ");
                    String title = input.nextLine();
                    library.searchTitle(title);
                    break;
                case 3:
                    System.out.print("Enter book title to checkout: ");
                    String checkoutTitle = input.nextLine();
                    library.checkoutBook(user, checkoutTitle);
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = input.nextLine();
                    library.returnBook(user, returnTitle);
                    break;
                case 5:
                    System.out.println("Thank you for using the library system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }


        } while (choice != 5);

    }
}