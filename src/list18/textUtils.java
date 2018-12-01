package list18;

public class textUtils {

    public static boolean isEmpty1(String text) {

        if (text == null) {
            return true; //jesli nie ma to true
        } else
            return false; //jesli cos ma w sobie to false
    }
    //static powoduje, ze nie potrzebujemy obiektow do odpalenia tych metod
    public static boolean isEmpty2(String text) {
        if (text == null || text.length() == 0) {
            return true;
        } else
            return false;
    }

    public static boolean isGreaterThan(String text, int min) {
        if (text != null && text.length() > min && text.length()>0) {
            return true;
        } else
            return false;
    }
}

