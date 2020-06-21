package pl.sda;

import pl.sda.animal.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //interfejs vs klasa
        //polimorfizm
        //kontrakt - przyklad z zycia - powitanie

        // tak nie mozemy zrobic (podobnie jak w klasach abstr)
        // Flies flies = new Flies();

        Scanner scanner = new Scanner(System.in);
        MakesSound makesSound;
        String choice = scanner.nextLine();
        if (choice.equals("kot")) {
            makesSound = new Cat();
        } else if (choice.equals("pies")) {
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
        //Jakie klasy implementuja CharSequence
        //defaultowe metody, omowic

    }
}
