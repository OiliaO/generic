package products;

public class Book extends Product {
    private static int counter = 0;
    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }

    public String getGenre() {
        return genre;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    protected String generateId() {
        counter++;
        return "1" + String.format("%03d", counter);
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author + ", Publication: " + publication + ", Genre: " + genre;
    }
}