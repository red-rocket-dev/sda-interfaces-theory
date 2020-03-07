package pl.sda.animal;

public class Parrot implements MakesSound, Flies{
    public String makeSound() {
        return "kra kra";
    }

    public String fly() {
        return "fru fru";
    }
}
