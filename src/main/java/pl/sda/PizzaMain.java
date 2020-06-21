package pl.sda;

import pl.sda.pizza.BasePizza;
import pl.sda.pizza.PizzaWithCheese;

import java.math.BigDecimal;
import java.util.Arrays;

public class PizzaMain {
    public static void main(String[] args) {
        PizzaWithCheese pizzaWithCheese = new PizzaWithCheese();

        pizzaWithCheese.setName("Pizza z serem");
        pizzaWithCheese.setPrice(BigDecimal.valueOf(10));
        System.out.println(pizzaWithCheese.getName());
        System.out.println(pizzaWithCheese.getPrice());
        System.out.println(pizzaWithCheese.getIngredientsMessage());

        //BasePizza pizza = new BasePizza();
    }
}
