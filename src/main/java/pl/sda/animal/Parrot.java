package pl.sda.animal;

public class Parrot implements MakesSound, Flies {
    @Override
    public String makeSound() {
        return "kra kra";
    }

    @Override
    public String fly() {
        return null;
    }
}
