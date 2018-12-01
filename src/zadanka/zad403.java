package zadanka;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class zad403 {
    public static void main(String[] args) {

        GregorianCalendar gregCal = new GregorianCalendar();
        gregCal.set(1992,Calendar.MARCH,19);
        System.out.println(gregCal.getTime());

    }
}
