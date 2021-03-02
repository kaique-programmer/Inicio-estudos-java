package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L); // 00:00 de 1970
        Date x4 = new Date(1000L * 60L * 60L * 5L); // 5 hrs de 1970

        Date y1 = sdf.parse("03/03/2021");
        Date y2 = sdf1.parse("03/03/2021 13:12:13");
        Date y3 = Date.from(Instant.parse("2021-03-02T14:25:59Z"));

        System.out.println("------------------------"); // no format is in  english
        System.out.println("x1: " + sdf1.format(x1));
        System.out.println("x2: " + sdf1.format(x2));
        System.out.println("x3: " + sdf1.format(x3));
        System.out.println("x4: " + sdf1.format(x4));
        System.out.println("y1: " + sdf1.format(y1));
        System.out.println("y2: " + sdf1.format(y2));
        System.out.println("y3: " + sdf1.format(y3));
        System.out.println("------------------------");
        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3));
    }
}
