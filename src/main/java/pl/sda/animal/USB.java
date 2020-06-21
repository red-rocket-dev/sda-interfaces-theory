package pl.sda.animal;

public interface USB {
    //wszystkie pola zdefiniowane w interfejsach sa:
    // publiczne
    // statyczne
    // finalne
    String EXIT_CODE = "1234";
    int USB_SIZE = 123;

    void afterConnect();
    void duringWork();
    void duringDisconnect();
}
