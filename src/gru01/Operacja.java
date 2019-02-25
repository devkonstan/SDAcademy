package gru01;

public class Operacja<P extends Number, D extends Number> {
    private P LiczbaPierwsza;
    private P LiczbaDruga;


    public Operacja(P liczbaPierwsza, P drugaLiczba) {
        this.LiczbaPierwsza = liczbaPierwsza;
        this.LiczbaDruga = drugaLiczba;
    }

    public Integer SumaWInteger() {
        return LiczbaPierwsza.intValue() + LiczbaDruga.intValue();
    }

    public Double SumaWDouble() {

        return LiczbaPierwsza.doubleValue() + LiczbaDruga.doubleValue();
    }

}

