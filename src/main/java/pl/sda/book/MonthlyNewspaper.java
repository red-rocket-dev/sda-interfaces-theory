package pl.sda.book;

import java.time.LocalDate;

public class MonthlyNewspaper extends CoverWithTitle {
    private LocalDate publishTime;

    public MonthlyNewspaper(String title, LocalDate publishTime) {
        super(title);
        this.publishTime = publishTime;
    }

    public LocalDate getPublishTime() {
        return publishTime;
    }

    @Override
    public String getCover() {
        return super.getCover() + " " + publishTime;
    }
}
