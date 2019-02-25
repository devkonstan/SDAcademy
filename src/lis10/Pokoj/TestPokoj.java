package lis10.Pokoj;

public class TestPokoj {
    public static void main(String[] args) {
        Pokoj tata=new Pokoj();
        Pokoj mama=new Pokoj();
        Pokoj siostra=new Pokoj();
        Pokoj brat=new Pokoj();

        Pokoj mojpokoik =new Pokoj();
        //                  zm ref   obiekt w klasie   pole w klasie
        System.out.println(mojpokoik.powierzchnia); //domyslne 0
        System.out.println(mojpokoik.czyjestTelewizja.telewizja);
        System.out.println(siostra.czyjestTelewizja.telewizja);

        System.out.println("*****");

        System.out.println(tata.iloscDrzwi); //domyslne wartosci
        System.out.println(mama.iloscOkien); //domyslne wartosci
    }
}
