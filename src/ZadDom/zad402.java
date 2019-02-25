package ZadDom;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class zad402 {
    public static void main(String[] args) {
        //Date date=new Date();
        Calendar cal = Calendar.getInstance();
        //cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+" "+month+" "+day);

        Date data = new Date();
        LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int rok  = localDate.getYear();
        int miesiac = localDate.getMonthValue();
        int dzien   = localDate.getDayOfMonth();
        System.out.println(rok+" "+miesiac+" "+dzien);
    }
}
