package pl.sda.pizza;

import java.math.BigDecimal;

public class PizzaWithTomato {
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

    public BigDecimal discount(int age) {
        BigDecimal ageBigDecimal = BigDecimal.valueOf(age);
        BigDecimal discountFactor = BigDecimal.valueOf(100).subtract(ageBigDecimal);
        return discountFactor.multiply(price);
    }
}
