package mta;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class Dates {
    public static void main(String[] args) {
        System.out.printf("%s%n", DayOfWeek.MONDAY.plus(3));
        DayOfWeek dow = DayOfWeek.MONDAY;
        Locale locale = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));

        System.out.printf("now (from Instant): %s%n",
                LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
    }
}