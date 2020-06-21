package pl.sda.registration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileRegistrationForm implements RegistrationForm {
    private String name;
    private int age;

    public FileRegistrationForm() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj sciezke do pliku");
        String filePathString = scanner.nextLine();
        Path filePath = Path.of(filePathString);
        String contents = Files.readString(filePath);
        String[] splittedContent = contents.split(";");
        name = splittedContent[0];
        age = Integer.parseInt(splittedContent[2]);
    }

    @Override
    public String retrieveName() {
        return name;
    }

    @Override
    public int retrieveAge() {
        return age;
    }
}
