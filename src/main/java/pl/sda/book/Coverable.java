package pl.sda.book;

public interface Coverable {
    String getCover();

    //domyslna implementacja metody (tylko na potrzeby demonstracyjne)
    /*default String getSize() {
        return "xxx";
    }*/

    //statyczne metody z implementacja tez moga byc w interfejsach
    /*static String getSize() {
        return "xyz";
    }*/
}

