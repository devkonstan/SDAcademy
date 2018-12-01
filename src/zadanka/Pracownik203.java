package zadanka;

public class Pracownik203 {
    String imie, nazwisko;
    int wiek;

    Pracownik203() {
        this("Kowalski","Jan",18);
    }

    Pracownik203(String nazwisko) {
        this(nazwisko,"Jan", 18);
    }

    Pracownik203(String nazwisko, String imie) {
        this(imie, nazwisko, 18);
    }

    Pracownik203(String nazwisko, String imie,  int wiek) {
        this.nazwisko=nazwisko;
        this.imie=imie;
        this.wiek=wiek;
    }
}
