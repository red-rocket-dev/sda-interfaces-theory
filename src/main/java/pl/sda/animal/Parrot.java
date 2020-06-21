package pl.sda.animal;

public class Parrot implements Bird {
    @Override
    public String makeSound() {
        return "kra kra";
    }

    @Override
    public String fly() {
        return null;
    }
}
