package pl.sda.pizza;

import java.math.BigDecimal;
import java.util.Arrays;

// jesli chce miec abstrakcyjna metode to klasa musi byc abstrakcyjna
// jesli chce miec abstrakcyjna klase to wcale nie musze miec w niej zadnej abstrakcyjnej metody
// klasa abstrakcyjna nie moze byc instancjonowana (nie mozemy tworzyc obiektow tego typu), np:
// BasePizza pizza = new BasePizza();
// klasy abstrakcyjne moga dziedziczyc zarowno po klasach zwyczajnych
// ale rowniez po abstrakcyjnych
public abstract class BasePizza extends MenuItem {
    public BigDecimal discount(int age) {
        BigDecimal ageBigDecimal = BigDecimal.valueOf(age);
        BigDecimal discountFactor = BigDecimal.valueOf(100).subtract(ageBigDecimal);
        return discountFactor.multiply(getPrice());
    }

    abstract String[] getSpecificIngredients();

    abstract int getSpecificWeight();

    public int getWeight() {
        return getSpecificWeight() + 10;
    }

    public String getIngredientsMessage() {
        String[] specificIngredients = getSpecificIngredients();
        boolean containsMilk = false;
        for (int i = 0; i < specificIngredients.length; i++) {
            if (specificIngredients[i].equals("cheese")) {
                containsMilk = true;
                break;
            }
        }
        String message = "";
        if(containsMilk) {
            message += "Uwaga, zawiera laktoze! ";
        }
        message += Arrays.toString(specificIngredients);
        return message;
    }

    /*
    Tak mozna zrobic tez
    @Override
    boolean isMealHot() {
        return false;
    }*/
}
