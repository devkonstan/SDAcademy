package zadanka;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class zad404 {
        public static void main(String[] args) {

            GregorianCalendar data1 = new GregorianCalendar();
            data1.set(2092, Calendar.MARCH,19);
            System.out.println(data1.getTime());

            GregorianCalendar data2=new GregorianCalendar();
            data2.set(2092,Calendar.JUNE,19);

            boolean sameDay = data1.get(Calendar.DAY_OF_YEAR) == data2.get(Calendar.DAY_OF_YEAR) &&
                    data1.get(Calendar.YEAR) == data2.get(Calendar.YEAR) && data1.get(Calendar.MONTH) == data2.get(Calendar.MONTH);

            System.out.println(sameDay);
        }
    }

