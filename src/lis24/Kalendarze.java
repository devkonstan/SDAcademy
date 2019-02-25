package lis24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kalendarze {
    public static void main(String[] args) {

        Calendar cal = new GregorianCalendar();
        long aktualnaData = cal.getTimeInMillis();
        System.out.println(aktualnaData);
        long roznicaCzasu = 2082697200000L - aktualnaData;
        System.out.println(roznicaCzasu / (1000 * 60 * 60 * 24));
    }
}
