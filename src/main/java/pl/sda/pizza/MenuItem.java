package pl.sda.pizza;

import java.math.BigDecimal;

//to jest zwyczajna klasa
public abstract class MenuItem {
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    abstract boolean isMealHot();
}
