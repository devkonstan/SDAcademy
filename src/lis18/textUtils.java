package lis18;

public class textUtils {
    //static powoduje, ze nie potrzebujemy obiektow do odpalenia tych metod
    public static boolean isEmpty1(String text) {

        if (text == null) {
            return true; //jesli brak jakiejkolwiek tresci to true
        } else
            return false; //jesli cos ma w sobie to false
    }


    public static boolean isEmpty2(String text) {

        if (text == null || text.length() == 0) {
            return true;
        } else
            return false;
    }

    public static boolean isGreaterThan(String text, int min) {
        if (text != null && text.length() >= min && text.length() >= 0) {
            return true;
        } else
            return false;
    }
}

