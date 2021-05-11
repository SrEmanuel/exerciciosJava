package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("DEFAULT: "+ sdf.format(d));

        Calendar cal = Calendar.getInstance(); //initializing calendar
        cal.setTime(d); //setting calendar time
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime(); //returning that updated date to d variable
        System.out.println("UPDATED: "+ sdf.format(d));

        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH); //I added one to this because the Calendar month starts at zero, not one.


        System.out.println("MINUTES: "+ minutes);
        System.out.println("MONTH: "+ month);
    }
}
