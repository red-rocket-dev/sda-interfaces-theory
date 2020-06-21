package pl.sda.registration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RegistrationMain {
    public static void main(String[] args) throws IOException {
        RegistrationForm registrationForm = new FileRegistrationForm();
        String name = registrationForm.retrieveName();
        int age = registrationForm.retrieveAge();
        Files.writeString(Path.of("students.txt"), name + " " + age);
    }
}
