import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

public class practiceset15 {
public static void main(String[] args) {

    //problem1:

   /*  ArrayList<String> a=new ArrayList<>();
    a.add("Ram");
    a.add("vian");
    a.add("gauri");
    a.add("kalu");
    a.add("lak");
    a.add("kk");
    a.add("khsd");
    a.add("lwdi");
    a.add("uieh");
    a.add("osoi");
    a.add("vqioue");
    a.add("viaooooo");
    for(String i:a){
        System.out.println(i);
    } */


    // problem5
    /* HashSet<Integer> s=new HashSet<>();
    s.add(54);
    s.add(45);
    s.add(74);
    s.add(40);
    s.add(44);
    s.add(43);
    s.add(43); 

    Iterator<Integer> s1=s.iterator();

    while(s1.hasNext()){
        System.out.print(s1.next()+" ");
    } */



    // problem2:
    // Date d=new Date(0);
    // System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

    // problem3 

    

    // Calendar c=Calendar.getInstance();
    // System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));


    //problem4

     LocalTime t=LocalTime.now();
     System.out.println(t);

     DateTimeFormatter d=DateTimeFormatter.ofPattern("mm-ss-HH");
     System.out.println(t.format(d));







}
    
}