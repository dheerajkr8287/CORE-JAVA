import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class java_time_Api {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalTime t=LocalTime.now();
        System.out.println(t);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        
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
