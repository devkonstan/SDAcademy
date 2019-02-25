package ZadDom;

public class Firma203 {
    public static void main(String[] args) {

        Pracownik203[] pracownicy = {
                new Pracownik203("Bartoszewski"), 
                new Pracownik203(),
                new Pracownik203("Nowaczyk","Andrzej",42),
                new Pracownik203("Chocian","Paweł")
        };

        for (Pracownik203 pracusie : pracownicy) {
            System.out.println(pracusie.imie+"\t"+pracusie.nazwisko+"\t"+pracusie.wiek);
            } //czemu ta tabulacja zle wyswietla?

    }


}
