package list25;

public class wyjatek {

    public static void main(String[] args) {
        String napis="null";
        //metoda("ja");
        char b;

        try {
            b = napis.charAt(1);
            System.out.println(b);
            System.out.println("31g");
            throw new Errorek("błędzik");
        } catch (Errorek e) {
            System.out.println("ta linijka sie wywola jesli poleci Errorek");
        } catch(NullPointerException n) {
            System.out.println("nullek");
        } finally {
            System.out.println("ta sie wywola");
        }

        System.out.println("koniec programu");
    }

    static void metoda(String text) throws NullPointerException {
        System.out.println("tekscik");
        throw new NullPointerException();
    }
}
