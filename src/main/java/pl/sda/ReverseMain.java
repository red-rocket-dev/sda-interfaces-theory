package pl.sda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReverseMain {
    public static void main(String[] args) throws IOException {
        ReversedCharSequence alaMaKota = new ReversedCharSequence("ala ma kota");
        Files.writeString(Path.of("reversed.txt"), new ReversedCharSequence("ala ma kota"));
    }
}
