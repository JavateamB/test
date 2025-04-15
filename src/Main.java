
/**
 * This a main class to test Person.java
 *
 * @author Shiva Sharma
 * @version 1.0
 * @see griffin
 */



public class Main {

    /**
     * This is a main method
     *
     * @param args stores incoming the command line arg for the program
     */

    public static void main(String[] args) {



        griffin person = new griffin("Shiva Sharma");
        System.out.println(person.getName());

    }
}