import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.text.html.CSS;

public class calenderclass {
    public static void main(String[] args) {
        //This line creates a Calendar object set to the current date and time in the default time zone with the default locale

        
        // getInstance():Gets a calendar using the default time zone and locale.

        // Calendar c=Calendar.getInstance();
        // System.out.println(c.getCalendarType());//gregory
        // System.out.println(c.getTimeZone());

        // Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        Calendar c=Calendar.getInstance();//--deafault
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
        // System.out.println(c.getTimeZone().getID());




        // 2. Getting Date and Time Fields

        //get(int field):Returns the value of the given calendar field.

         
        // System.out.println(c.get(Calendar.YEAR));//current year
        // System.out.println(c.get(c.MONTH));// Note: Month is 0-based, so January is 0 and December is 11.

        // System.out.println(c.get(c.DAY_OF_MONTH));//current date
        // System.out.println(c.get(c.HOUR_OF_DAY));//current past hour
        // System.out.println(c.get(c.MINUTE));//current minute
        // System.out.println(c.get(c.SECOND));//current second




        // 3. Setting Date and Time Fields

        // set(int field, int value):Sets the given calendar field to the given value.
        //add(int field, int amount)Adds or subtracts the specified amount of time to the given calendar field, based on the calendar's rules.


            //  c.set(c.YEAR,2025)   ;
            //  System.out.println(c.get(c.YEAR));

            //  c.set(c.MONTH,c.AUGUST);
            //  System.out.println(c.get(c.MONTH));

            //  c.set(c.DAY_OF_MONTH,18);
            //  System.out.println(c.get(c.DAY_OF_MONTH));

            // c.set(2026,c.AUGUST,19,4,6,3);
            // System.out.println(c.get(c.YEAR));


            //4. Adding or Subtracting Time

            // System.out.println(c.get(c.DAY_OF_MONTH));

            // c.add(c.DAY_OF_MONTH,5);
            // System.out.println(c.get(c.DAY_OF_MONTH));

            // c.add(c.DAY_OF_MONTH,-5);
            // System.out.println(c.get(c.DAY_OF_MONTH));



            // 5. Getting a Date Object

            // Date d=c.getTime();
            // System.out.println(d);//getting current time with date


            // 6. Comparison Between Two Dates:You can compare two Calendar instances using methods like before(), after(), and equals():    -->to compare two Calendar objects.   :
            
            
            // before():The before() method checks whether the date and time of the current Calendar instance is before the date and time of another Calendar instance. It returns true if the current instance represents a time earlier than the specified when instance, otherwise, it returns false.

            //-->when - the Object to be compared

            /* Calendar calendar1 = Calendar.getInstance();
            calendar1.set(2024, Calendar.AUGUST, 18);

            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(2024, Calendar.SEPTEMBER, 18);

             if (calendar1.before(calendar2)) {
               System.out.println("calendar1 is before calendar2");
             } else {
               System.out.println("calendar1 is not before calendar2");
            } */


            // after():
            //The after() method checks whether the date and time of the current Calendar instance is after the date and time of another Calendar instance. It returns true if the current instance represents a time later than the specified when instance, otherwise, it returns false

          /*   Calendar calendar1=Calendar.getInstance();
            calendar1.set(2024,calendar1.SEPTEMBER,19);
            Calendar calendar2=Calendar.getInstance();
            calendar2.set(2024,calendar2.AUGUST,18);

            if(calendar1.after(calendar2)){
                System.out.println("Calender1 is after the calender 2");

            }
            else{
                System.out.println("Calender 1 is not after the calender 2");
            } */


            //isEqual():
            // The equals() method checks whether the date and time of the current Calendar instance is equal to the date and time of another Calendar instance. It returns true if both Calendar instances represent the exact same time, including all fields, otherwise, it returns false.


          /*   Calendar calendar1=Calendar.getInstance();
            calendar1.set(2024,calendar1.AUGUST,18,19,20);
            Calendar calendar2=Calendar.getInstance();
            calendar2.set(2024,calendar2.AUGUST,18,19,20);
            if(calendar1.equals(calendar2)){
                System.out.println("Calender 1 is equal is calender2");
            }
            else{
                System.out.println("calender 1 is not equal is calender 2");
            } */




            //7. Formatting Dates:Formatting a date means converting a Date object into a String according to the pattern defined in SimpleDateFormat


            // SimpleDateFormat class in Java is used for formatting and parsing dates in a way that is easy to customize. It allows you to convert a Date object to a String (formatting) and a String to a Date (parsing) based on a specified pattern.

            // Create a SimpleDateFormat instance
             SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //  Get the current date
            Date now=new Date();
            // Format the date
            String formattedDate=sdf.format(now);
            System.out.println("formattedDate:"+formattedDate);



            
            // 3. Date Parsing


            // Parsing a date means converting a String into a Date object based on the pattern defined in SimpleDateFormat.

             // Parse a string into a date


            //  Parse the String: Use the parse() method of SimpleDateFormat to convert the string into a Date object. If the string doesn’t match the specified pattern, a ParseException will be thrown.

             try{
                 String dateString="2024-08-18 2:47:33";
                 Date date=sdf.parse(dateString);

                 System.out.println("parsed:"+date);


             }
             catch(Exception e){
                System.out.println(e);
             }













            











    }
}
