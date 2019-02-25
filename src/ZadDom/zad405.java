package ZadDom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class zad405 {
    public static void main(String[] args) {
        GregorianCalendar data1 = new GregorianCalendar();
        data1.set(2092, Calendar.MARCH,19);
        Date firstDate=data1.getTime();
        System.out.println(firstDate);

        GregorianCalendar data2=new GregorianCalendar();
        data2.set(2092,Calendar.JUNE,23);
        Date secondDate=data1.getTime();
        System.out.println(secondDate);

        //long diff = secondDate-firstDate;

        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        String inputString1 = "23 01 1997";
        String inputString2 = "27 04 1997";

        try {
            Date date1 = myFormat.parse(inputString1);
            Date date2 = myFormat.parse(inputString2);
            long diff = date2.getTime() - date1.getTime();
            System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}