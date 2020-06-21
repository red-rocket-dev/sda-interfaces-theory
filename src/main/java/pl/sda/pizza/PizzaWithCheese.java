package pl.sda.pizza;

import java.math.BigDecimal;

public class PizzaWithCheese extends BasePizza {
    @Override
    public BigDecimal discount(int age) {
        BigDecimal two = BigDecimal.valueOf(2);
        BigDecimal ageBigDecimal = BigDecimal.valueOf(age).multiply(two);
        BigDecimal discountFactor = BigDecimal.valueOf(100).subtract(ageBigDecimal);
        return discountFactor.multiply(getPrice());
    }

    @Override
    public String[] getSpecificIngredients() {
        return new String[]{"cheese", "sauce"};
    }

    @Override
    int getSpecificWeight() {
        return 100;
    }

    // ta metoda byla zdefiniowana jako abstrakcyjna w MenuItem
    // moglismy ja juz zaimplementowac w BasePizza
    // ale moglismy tez ja zostawic bez implementacji (co zrobilismy)
    // i w klasie dziedziczacej po BasePizza musimy dac cialo metody
    @Override
    boolean isMealHot() {
        return true;
    }
}