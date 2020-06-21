package pl.sda.registration;

import java.util.Scanner;

public class ConsoleRegistrationForm implements RegistrationForm {

    @Override
    public String retrieveName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        return scanner.nextLine();
    }

    @Override
    public int retrieveAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        return Integer.parseInt(scanner.nextLine());
    }
}
