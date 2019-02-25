package sty26.Programisci;

import java.util.Objects;

public class Developer {
    private String imie;
    private String nazwisko;
    private int wiek;
    JezykProgramowania jezyk;

    public Developer(String imie, String nazwisko, int wiek, JezykProgramowania jezyk) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.jezyk = jezyk;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public JezykProgramowania getJezyk() {
        return jezyk;
    }

    public void setJezyk(JezykProgramowania jezyk) {
        this.jezyk = jezyk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer)) return false;
        Developer developer = (Developer) o;
        return jezyk == developer.jezyk;
    }


    @Override
    public int hashCode() {
        return Objects.hash(jezyk);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", jezyk=" + jezyk +
                '}';
    }

}
