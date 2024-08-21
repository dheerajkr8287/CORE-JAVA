import java.lang.reflect.Constructor;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TimeZone;

import javax.swing.text.html.CSS;

public class gregorian {
    public static void main(String[] args) {
        // Calendar c=Calendar.getInstance();
        // System.out.println(c.get(Calendar.DATE));
        // System.out.println(c.get(Calendar.SECOND));
        // System.out.println(c.get(Calendar.HOUR));
        // System.out.println(c.get(Calendar.HOUR_OF_DAY));
        // System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

// GregorianCalendar is a concrete subclass of Calendar and provides the standard calendar system used by most of the world.


// Default Constructor: Creates a GregorianCalendar with the current date and time.
         GregorianCalendar cal=new GregorianCalendar();
// Constructor with Specific Date: Creates a GregorianCalendar with a specific date and time.
        GregorianCalendar cal1=new GregorianCalendar(2024,Calendar.AUGUST,18);

        // System.out.println(cal.isLeapYear(2039));

        cal.add(0, 0);

        // get method
        // System.out.println(cal.get(Calendar.YEAR));
        // System.out.println(cal.get(Calendar.MONTH));
        // System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        // set method
        // cal.set(Calendar.YEAR,2025);
        // System.out.println(cal.get(Calendar.YEAR));
        // cal.set(Calendar.MONTH, Calendar.DECEMBER);
        // System.out.println(cal.get(Calendar.MONTH));

        // add method
        // cal.add(Calendar.DAY_OF_MONTH,1);
        // System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        // cal.add(Calendar.DAY_OF_MONTH,-1);
        // System.out.println(cal.get(Calendar.DAY_OF_MONTH));


        // roll method: allows you to add or subtract time from a field without changing more significant fields.
        // cal.roll(Calendar.DAY_OF_MONTH, 2);
        // System.out.println(cal.get(Calendar.DAY_OF_MONTH));



        // 5. Time Zone Handling


        // get time Zone
        // System.out.println(cal.getTimeZone());
        // set time zone
        // cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        // System.out.println(cal.getTimeZone());


        // System.out.println(TimeZone.getAvailableIDs()[0]);
        // System.out.println(TimeZone.getAvailableIDs()[10]);
        // System.out.println(TimeZone.getAvailableIDs()[20]);
        // System.out.println(TimeZone.getAvailableIDs()[30]);
        // System.out.println(TimeZone.getAvailableIDs()[40]);


        //ZoneId: Represents a time zone.

        // Get the default time zone


        // ZoneId deafautZoneId=ZoneId.systemDefault();
        // System.out.println("Deafault time Zone:"+deafautZoneId);

        // Get a specific time zone

        // ZoneId s=ZoneId.of("America/New_York");
        // System.out.println("SPecfic ZOne :"+s);



        // for ALl TimeZone print
        // ZoneId.getAvailableZoneIds().forEach(System.out::println);


        /*  // Get all available time zone IDs

        Set<String> z = ZoneId.getAvailableZoneIds();

        // Use a for-each loop to iterate over the set and print each time zone ID

        for (String i : z) {
            System.out.println(i);
        } */


        //2.:ZonedDateTime: Represents a date and time with a time zone.


        // Get the current date and time with the default time zone
        // ZonedDateTime now=ZonedDateTime.now();
        // System.out.println("Current date and time is:"+now);


        // Get the current date and time in a specific time zone
        // ZonedDateTime specfic=ZonedDateTime.now(ZoneId.of("US/Pacific"));
        // System.out.println("Specfic date and time:"+specfic);


        //Create a ZonedDateTime for a specific date, time, and time zone
        // ZonedDateTime sdt=ZonedDateTime.of(2024, 8, 18, 07, 6, 1,0,ZoneId.of("Europe/Paris"));
        // System.out.println("create date and time:"+sdt);


        // format ZoneDatetime
        // DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // System.out.println(now.format(formatter));




        // OffsetDateTime
        // The OffsetDateTime class represents a date and time with an offset from UTC/Greenwich.
        //A date-time with an offset from UTC/Greenwich in the ISO-8601 calendar system, such as 2007-12-03T10:15:30+01:00.


        // Get the current date and time with an offset from UTC

        OffsetDateTime o1=OffsetDateTime.now();
        System.out.println("Current off set date and time is:"+o1);

        // Create an OffsetDateTime for a specific date, time, and offset
        OffsetDateTime o2=OffsetDateTime.of(2024,4,18,15 ,3,0,0,ZoneOffset.ofHours(-5));
        System.out.println("Specific date and time with offset -5 hours: " + o2);













    }

}
