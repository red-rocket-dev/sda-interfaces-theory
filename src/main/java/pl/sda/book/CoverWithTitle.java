package pl.sda.book;

public abstract class CoverWithTitle implements Titleable, Coverable {
    private String title;

    public CoverWithTitle(String title) {
        this.title = title;
    }

    @Override
    public String getCover() {
        return title.toUpperCase();
    }

    @Override
    public String getTitle() {
        return title;
    }
}
