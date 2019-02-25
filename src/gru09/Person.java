package gru09;

public class Person {
    private String imie;
    private String nazwisko;
    private int wiek;

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    Person(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

}
