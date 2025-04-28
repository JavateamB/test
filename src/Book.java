/**

 * griffin class for storing user information
 * Person call with fields,
 */

public class Book {
    /**
     * name of a person
     */
    private String name;

    /**
     * This is a construction to initialize person object
     *
     * @param name inital person name
     */
    public Book(String name) {
        this.name = name;
    }

    /**
     * Display person name
     *
     * @return person name
     */
    public String getName() {
        return "This method will display a person name " + name;
    }

    /**
     * To set a person name
     *
     * @param name a new person name pass the string variable <code>String</code>
     */
    //hello//
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("Person Name " + name);
    }

}

