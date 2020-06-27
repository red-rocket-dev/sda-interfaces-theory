package pl.sda.book;

public class FantasyBook extends CoverWithTitle {
    private String author;

    public FantasyBook(String title, String author) {
        super(title);
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String getCover() {
        // tutaj wywolujemy getCover z klasy nadrzednej, zeby dostac cover sformatowany przez klase wyzsza
        return super.getCover() + " " + author;
    }
}
