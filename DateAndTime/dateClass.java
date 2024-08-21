import java.util.Date;
//The class Date represents a specific instant in time, with millisecond precision.

public class dateClass {
    public static void main(String[] args) {
       Date d=new Date();
       Date d2=new Date();
       System.out.println(d);

       System.out.println(d.getTime());
       System.out.println(d.getDate());
       System.out.println(d.getSeconds());
       System.out.println(d.after(d2));//Tests if this date is after the specified date.

    }
}
