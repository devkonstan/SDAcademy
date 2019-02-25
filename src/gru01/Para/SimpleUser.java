package gru01.Para;

//ta klasa wybiera sobie pola z klasy User potrzebne do wykorzystania w TestPair
    public class SimpleUser {
        String nazwisko;
        int wiek;

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public SimpleUser(User user) {
            this.nazwisko = user.getNazwisko();
            this.wiek = user.getWiek();
        }
    }
