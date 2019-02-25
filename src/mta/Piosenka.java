package mta;

import java.util.Objects;

public class Piosenka implements Comparable<Piosenka> {
    String tytul;
    String artysta;
    String ocena;
    String bpm;

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getArtysta() {
        return artysta;
    }

    public void setArtysta(String artysta) {
        this.artysta = artysta;
    }

    public String getOcena() {
        return ocena;
    }

    public void setOcena(String ocena) {
        this.ocena = ocena;
    }

    public String getBpm() {
        return bpm;
    }

    public void setBpm(String bpm) {
        this.bpm = bpm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Piosenka)) return false;
        Piosenka piosenka = (Piosenka) o;
        return Objects.equals(tytul, piosenka.tytul);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tytul);
    }

    @Override
    public String toString() {
        return tytul;
    }

    public Piosenka(String tytul, String artysta, String ocena, String bpm) {
        this.tytul = tytul;
        this.artysta = artysta;
        this.ocena = ocena;
        this.bpm = bpm;
    }

    @Override
    public int compareTo(Piosenka p) {

        return tytul.compareTo(p.tytul);
    }
}
