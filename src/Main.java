
/*This Main.java file contains a Scanner class, do-while loop, switch statement, logical operators
  println, method calling, object creation, variables, if statement, constructor, println
*/


/**
 * This a main class to run the library system
 *
 * @author Griffin Hayes
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

        //Scanner object//
        Scanner input = new Scanner(System.in);
        Library library = new Library();

        //Creating a user, print used//
        System.out.print("Enter your name: ");
        String userName = input.nextLine();
        User user = new User(userName);

        //variable declaration//
        int choice;

        //do-while loop to continuously run the program until finished//
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

            //Switch statement for user input scenarios//
            switch (choice) {
                case 1:
                    library.listAllBooks();
                    break;
                case 2: // Fixed case 2 to actually make it work
                    System.out.print("Enter book title to search: ");
                    String title = input.nextLine();
                    Book foundBook = library.searchTitle(title);
                    //If statement to check for the book title//
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("Book not found in the library.");
                    }
                    break;
                case 3:
                    System.out.print("Enter book title to checkout: ");
                    String checkoutTitle = input.nextLine();
                    library.checkBook(user, checkoutTitle);
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = input.nextLine();
                    //An example of a constructor using returnBook method from Library class//
                    library.returnBook(user, returnTitle);
                    break;
                case 5:
                    System.out.println("Thank you for using the library system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break; // We were missing a break statement here, so I added it - Marvin
            }


        } while (choice != 5);

    }
}