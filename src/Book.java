//Book class has conditional operator, constructor, more this keywords//
public class Book {

    //Encapsulation at its finest right here//
    private String title;
    private String author;
    private String isls;
    private boolean availability;


    public Book(String title, String author, String isls){
        //this keyword//
        this.title = title;
        this.author = author;
        this.isls = isls;
        this.availability = true;
    }

    public String getTitle(){
        return title;
    }

    public boolean isAvailable(){
        return availability;
    }

    public void setAvailable(boolean availability) {
        this.availability = availability;
    }

    public String toString(){
        //conditional operator where it says availability ?//
        return "\"" + title + "\" by " + author + " (ISLS: " + isls + ") - " + (availability ? "Available" : "Checked Out");
    }



}

