package pl.sda;

import pl.sda.animal.Cat;
import pl.sda.animal.Dog;
import pl.sda.animal.MakesSound;
import pl.sda.animal.Parrot;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //interfejs vs klasa
        //polimorfizm
        //kontrakt - przyklad z zycia - powitanie

        Scanner scanner = new Scanner(System.in);
        final MakesSound makesSound;
        if (scanner.nextLine().equals("kot")) {
            makesSound = new Cat();
        } else if (scanner.nextLine().equals("pies")) {
            makesSound = new Dog();
        } else {
            makesSound = new Parrot();
        }
        System.out.println(makesSound.makeSound());

        //1. Jakby to wygladalo, gdybysmy nie uzyli interfejsu? Czy mielibysmy wiecej kodu?
        //2. Czy interfejsy moga byc podawane w argumentach metod?
        //3. Co daje zadeklarowanie MakesSound jako final (to nie ma nic wspolego z interfejsami)
        //4. Znane interfejsy CharSequence, Reader
        //5. ReverseCharSequence - implementacja CharSequence

    }
}
