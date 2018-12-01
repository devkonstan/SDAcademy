public class NaszaKlasa {

        int x = 0;
        class FirstLevel {
            public int x = 1; //przysłonięcie zmiennej
            void methodInFirstLevel(int x) {
                System.out.println("x = " + x);
                System.out.println("this.x = " + this.x);
                System.out.println("ShadowTest.this.x = " + NaszaKlasa.this.x); //odwolanie do najwyzszej klasy
            }
        }
        public static void main(String... args) { //utworzenie obiektu nowego typu
            NaszaKlasa st = new NaszaKlasa();
            NaszaKlasa.FirstLevel fl = st.new FirstLevel();
            fl.methodInFirstLevel(23);
        }
    }


