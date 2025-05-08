//this is an abstract class, using modifiers and abstract method used in user class//

public abstract class Person {

    //protected modifier//
    protected String name;

    //this keyword//
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;

    }

    //abstract method//
    public abstract String getPerm();
}