package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date(); //create a new date with current time
        Date x2 = new Date(System.currentTimeMillis());//Here i create a new date with current time converted from milli seconds
        Date x3 = new Date();
        Date x4 = new Date(1000L * 60 * 60* 5);

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("x1: "+ sdf2.format(x1));//Here i can convert any date to the model that i defined in sdf2;
        System.out.println("x2: "+ sdf2.format(x2));
        System.out.println("x3: "+ sdf2.format(x3));
        System.out.println("x4: "+ sdf2.format(x4));
        System.out.println("y1: "+ sdf2.format(y1));
        System.out.println("y2: "+ sdf2.format(y2));
        System.out.println("y3: "+ sdf2.format(y3));


    }
}
