//this is an abstract class, using modifiers and abstract method used in user class//

/**
 * Abstract class Person is the parent class for User
 * Contains encapsulation, abstract method
 * @author Marvin
 * @see User
 */
public abstract class Person {

    /**
     * name of the person, encapsulated for only subclasses to use
     */
    protected String name;

    /**
     * Constructor to make a user with a name
     * @param name the name of the person signing in
     */
    public Person(String name) {

        this.name = name;
    }

    /**
     * method to get the name of the current user
     *
     * @return String name of the current user
     */
    public String getName() {
        return this.name;

    }

    /**
     * abstract method, the User class must implement this
     *
     * @return permission level of the user signed in
     */
    public abstract String getPerm();
}