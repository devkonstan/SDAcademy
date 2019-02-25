package lis10;

public class NaszaKlasa {

    int x = 0;

    class FirstLevel {
        public int x = 1; //przysłonięcie zmiennej

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x); //odwolanie do x podanego w sygnaturze metody ->23
            System.out.println("this.x = " + this.x); //odwolanie do x w klasie FirstLevel ->1
            System.out.println("ShadowTest.this.x = " + NaszaKlasa.this.x); //odwolanie do najwyzszej klasy ->0
        }
    }

    public static void main(String... args) { //utworzenie obiektu nowego typu
        NaszaKlasa nk = new NaszaKlasa();                   //obiekt w obiekcie jak jakby
        NaszaKlasa.FirstLevel fl = nk.new FirstLevel(); //dostep do klasy FirstLevel przez klasę lis10.NaszaKlasa
        fl.methodInFirstLevel(23);
    }
}


