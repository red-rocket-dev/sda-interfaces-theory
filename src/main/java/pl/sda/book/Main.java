package pl.sda.book;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // wyrob papierowy -> ksiazka/gazete/zeszyt
        // ksiazka -> ksiazka fantasy, ksiazka dokumentalna
        // gazeta -> gazeta miesiecznik, gazeta tygodnik
        // zeszyt -> zeszyt w kratke, zeszyt w linie
        // wszystkie z wyzej wymienionych rzeczy maja okladke
        // (okazuje sie, ze informacja o wyrobie papierniczym oznacza dla nas tylko, ze ma okladke)
        // patrz interfejs Coverable
        // dla gazety okladka to tytul + data wydania
        // dla ksiazki to tytul + autor
        // zeszytu ilosc kartek + czy w linie czy w kratke

        Coverable[] paperProducts = new Coverable[4];

        CoverWithTitle[] coversWithTitle = new CoverWithTitle[10];
        coversWithTitle[0] = new FantasyBook("", "");
        coversWithTitle[1] = new MonthlyNewspaper("", LocalDate.now());
        // tak sie nie da, bo Notebook nie implementuje Coverable
        //coversWithTitle[2] = new Notebook(false, 10);


        Comparable[] comparables = new Comparable[20];
        comparables[0] = Integer.valueOf("1");
        comparables[1] = 10;
        // Tak nie da rady:
        // Coverable aa = new Coverable();
        // Coverable test = new Notebook(true, 96);

        /*
        Klasa anonimowa:
        Coverable testWithAnnonClass1 = new Coverable() {
            @Override
            public String getCover() {
                return "abcd";
            }
        };

        Coverable testWithAnnonClass2 = new Coverable() {

            @Override
            public String getCover() {
                return "abcd";
            }
        };

        System.out.println(testWithAnnonClass1.getClass());
        System.out.println(testWithAnnonClass2.getClass());
        */



        FantasyBook fantasyBook = new FantasyBook("Alicja w krainie czarów", "Lewis Carroll");
        paperProducts[0] = fantasyBook;
        paperProducts[1] = new FantasyBook("Wiedźmin", "Andrzej Sapkowski");
        paperProducts[2] = new MonthlyNewspaper("CD Action", LocalDate.of(2000, 1, 1));
        paperProducts[3] = new Notebook(true, 96);

        fantasyBook.setAuthor("Test Test");

        for(Coverable product : paperProducts) {
            System.out.println(product.getCover());
            // polecam nie uzywac instanceof
            // jesli zaczynasz go uzywac to znaczy, ze najpewniej nie powinienes/as
            // wrzucac wszystkich obiektow do jednej tablicy (bo defakto nie traktujesz ich tak samo)
            // dla FantasyBook chociazby specjalnie wypisujemy tutaj autora
            // tutaj tego instanceof uzywam tylko w celach demonstracyjnych (nie jest potrzebne w zadaniu)
            if(product instanceof FantasyBook) {
                FantasyBook castedBook = (FantasyBook) product;
                System.out.println("Autor " + castedBook.getAuthor());
            }
            if(product instanceof Titleable) {
                Titleable titleable = (Titleable) product;
                System.out.println("Title " + titleable.getTitle());

            }
        }


    }
}
