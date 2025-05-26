package ha02.a1;

public class Book extends Publication {
    private String author;

    public Book(String title, int year, String author) {
        super(title, year);
        setAuthor(author);
    }

    public String getInfo(){
        return super.getInfo() + ", by " + author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
