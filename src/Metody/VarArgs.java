package Metody;

public class VarArgs {
    public void wyswietlString(String... texty) {
        System.out.println("ilosc argumentów: " + texty.length);
        System.out.println("1. element z parametrów: " + texty[0]);

        for (String tekscik : texty) {
            System.out.print(tekscik);
        }
        System.out.println();
        for (int i = 0; i < texty.length; i++) {
            System.out.print(texty[i]);
        }
        System.out.println();
    }

    void wyswietlProstokat(Prostokat... texty) {
        System.out.println("wielkosc tablicy: " + texty.length);

        for (int adres = 0; adres < texty.length; adres++) {
            Prostokat tmp = texty[adres];
            System.out.println("adres w pamieci to: "+tmp);
        }
    }
}



