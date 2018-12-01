package list17;

public final class  Cabrio extends Sportowy {
    public Cabrio() {
        liczbaDrzwi=2;
    }

    void skladamDach() {
        System.out.println("skladam daszek");
    }
    void jadeSzybko2() {
        tankujeDuzoPaliwa();
        skladamDach();
        //super.jadeSzybko(); //odwoluje sie poziom wyzej, bo inaczej bylaby rekurencja
        zapinamPasy();
        zamykamWszystkieDrzwi();
        odpalamSilnik();
        jazdaJazda();
    }
}
