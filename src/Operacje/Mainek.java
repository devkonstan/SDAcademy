package Operacje;

public class Mainek {
    public static void main(String[] args) {
        Dodawanie wynikDod=new Dodawanie();
        System.out.println("suma "+wynikDod.pobierzLiczby(2,3));

        Odejmowanie wynikOdej=new Odejmowanie();
        System.out.println("różnica "+wynikOdej.pobierzLiczby(5,1));

        Mnożenie mnozenie=new Mnożenie();
        System.out.println("iloczyn "+mnozenie.mnozymy(3,8));

        Dzielenie dzielonko=new Dzielenie();
        System.out.println("iloraz "+dzielonko.dzielimy(10,0));

        double tojuznieliczba=Double.parseDouble("4.5");
        System.out.println(tojuznieliczba*2);

        System.out.println(args[0]); //1 element parametru wywolania


    }
}
