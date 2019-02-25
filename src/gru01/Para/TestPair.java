package gru01.Para;


public class TestPair {
    public static void main(String[] args) {
        //dopiero tu okreslamy szczegolowo jakie typy przyjmuje nasz generyk
        Pair<String, Integer> uzytkownik = dajNajwazniejszeDaneUzytkownika(new User
                ("Damian", "Dawidczyk", 23, "Szczecin"));

        if (uzytkownik.snd >= 13) {
            System.out.println(uzytkownik.fst + " moze jechac na wycieczke");
        } else {
            System.out.println(uzytkownik.fst + " nie moze jechac na wycieczke");
        }
    }


    static Pair<String, Integer> dajNajwazniejszeDaneUzytkownika(User user) {
        return  new Pair<String, Integer>(user.getNazwisko(), user.getWiek());
    }
}