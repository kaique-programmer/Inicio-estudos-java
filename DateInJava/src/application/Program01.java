package application;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program01 {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date = Date.from(Instant.parse("2021-03-02T15:10:10Z"));

        System.out.println(sdf.format(date));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        /**calendar.add(Calendar.HOUR_OF_DAY, 4); Add 4 hours more
        date = calendar.getTime();
         System.out.println(sdf.format(date));*/

        int milliseconds = calendar.get(calendar.MILLISECOND), minutes = calendar.get(calendar.MINUTE), hours = calendar.get(calendar.HOUR);
        int month = 1 + calendar.get(calendar.MONTH); // dates begin 0
        System.out.println("Millisecond: " + milliseconds);
        System.out.println("Minute: " + minutes);
        System.out.println("Hour: " + hours);
        System.out.println("Month: " + month);
    }
}
