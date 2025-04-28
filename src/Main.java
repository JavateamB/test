
/**
 * This a main class to test Person.java
 *
 * @author Shiva Sharma
 * @version 1.0
 * @see Book
 */



public class Main {

    /**
     * This is a main method
     *
     * @param args stores incoming the command line arg for the program
     */

    public static void main(String[] args) {



        Book person = new Book("Shiva Sharma");
        System.out.println(person.getName());

    }
}