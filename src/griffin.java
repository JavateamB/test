

public class griffin {

    private String name;

    public griffin(String name) {
        this.name = name;
    }

    public String getName() {
        return "This method will display a person name " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("Person Name " + name);
    }

}

