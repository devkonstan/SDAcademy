public class Samochod {
    String kolor;
    Silnik silniczek;
    Samochod(String kolorek) {
        kolor=kolorek;
        this.silniczek=new Silnik();
    }
    Samochod() {
    this("czarny");
    }


}
