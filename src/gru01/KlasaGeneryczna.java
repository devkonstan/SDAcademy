package gru01;

//klasa uniwersalna na wszystkie typy danych
public class KlasaGeneryczna<P, D> {
    private P p;
    private D d;

    //zapisujemy je jako pola
    public KlasaGeneryczna(P p, D d) {
        this.p = p;
        this.d = d;
    }

    public P getP() {
        return p;
    }

    public D getD() {
        return d;
    }

    public void setP(P p) {
        this.p = p;
    }

    public void setD(D d) {
        this.d = d;
    }
}
