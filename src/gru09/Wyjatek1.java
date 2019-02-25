package gru09;

class Wyjatek1 {
    public static void main(String[] args) {
        Wyjatek1 e = new Wyjatek1();
        //e.someMethod(11);

        try {
            e.someMethod(98);
        } catch (MyChecked mc) { //tworzy obiekt odnoszacy sie do wyjatku
            System.out.println("exception raised");
        } finally {
            System.out.println("end of program");
        }
    }

    void someMethod(int i) throws MyChecked { //metoda z parametrem w sygnaturze rzucajaca moj Wyjatek
        if (i > 10) {
            throw new MyChecked();
        }
    }
}

class MyChecked extends Exception { //moj wlasny prywatny Wyjatek ;-)
}


