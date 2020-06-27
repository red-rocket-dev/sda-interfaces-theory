package pl.sda.book;

public class Notebook implements Coverable {
    private boolean lines;
    private int numberOfPages;

    public Notebook(boolean lines, int numberOfPages) {
        this.lines = lines;
        this.numberOfPages = numberOfPages;
    }

    public boolean isLines() {
        return lines;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    //ilosc stron + czy w linie czy w kratke
    @Override
    public String getCover() {
        String linesText;
        if(lines) {
            linesText = "w linie";
        } else {
            linesText = "w kratke";
        }
        return numberOfPages + " " + linesText;
    }
}
