package pl.sda.registration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RegistrationMain {
    public static void main(String[] args) throws IOException {
        saveStudents(new ConsoleRegistrationForm());
    }

    public static void saveStudents(RegistrationForm source) throws IOException {
        Files.writeString(Path.of("students.txt"),
                source.retrieveName()
                + " "
                + source.retrieveAge());
    }
}
