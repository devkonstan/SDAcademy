package gru01.Soki;

public class TestSoki {
    public static void main(String[] args) {
        //nazwa generowana
        Pudelko<Arbuzowy> arbuzowyPudelko = new Pudelko<>(new Arbuzowy());
        arbuzowyPudelko.nalej();

        Pudelko<Pomaranczowy> pomaranczowyPudelko = new Pudelko<>(new Pomaranczowy());
        pomaranczowyPudelko.nalej();
    }
}
