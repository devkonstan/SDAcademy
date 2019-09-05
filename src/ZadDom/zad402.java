package ZadDom;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class zad402 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH); //styczen do 0
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + " " + month + " " + day);

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int rok = localDate.getYear();
        int miesiac = localDate.getMonthValue();
        int dzien = localDate.getDayOfMonth();
        System.out.println(rok + " " + miesiac + " " + dzien);
    }
}
