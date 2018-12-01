package list17;

public enum dzienTyg {
    PONIEDZIALEK("pon", "el lunes",1),
    WTOREK("wt", "el martes",2),
    ŚRODA("śr", "el miercoles",3),
    CZWARTEK("czw", "el jueves",4),
    PIĄTEK("pt", "el viernes",5),
    SOBOTA("sb", "el sabado",6),
    NIEDZIELA("nd", "el domingo",7);

    dzienTyg(String nazwaPoPolsku, String nazwaPoHiszpansku, int nrDnia) {
        this.nazwaPoPolsku = nazwaPoPolsku;
        this.nazwaPoHiszpansku = nazwaPoHiszpansku;
        this.nrDnia=nrDnia;
    }

    private String nazwaPoPolsku;
    private String nazwaPoHiszpansku;
    private int nrDnia;

    String dajNazwePoPolsku() {
        return nazwaPoPolsku;
    }

    String dajNazwePoHiszpansku() {
        return nazwaPoHiszpansku;
    }

    int dajNrDnia() {
        return nrDnia;
    }
}