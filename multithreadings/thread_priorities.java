/*
 * Background Information: Java Threads
The JVM defines a range of ten logical priorities for Java threads, including:

java.lang.Thread.MIN_PRIORITY  = 1
java.lang.Thread.NORM_PRIORITY = 5
java.lang.Thread.MAX_PRIORITY  = 10
These values [1..10] are passed into Thread.setPriority(int) to assign priorities to Java threads. The default priority of a Java thread is NORM_PRIORITY. (A Java thread that doesn't explicitly call setPriority runs at NORM_PRIORITY.) A JVM is free to implement priorities in any way it chooses, including ignoring the value.


 */


class mythr extends Thread{
    // constructor
    public mythr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Thankyou"+this.getName());
            i++;
        }
    }

}


public class thread_priorities {
    public static void main(String[] args) {

        // ready queue t1,t2,t3,t4,t5

        mythr t1=new mythr("harry1");
        mythr t2=new mythr("harry2");
        mythr t3=new mythr("harry3");
        mythr t4=new mythr("harry4");
        mythr t5=new mythr("harry5 MOst Important");
        
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t5.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();


        
    }
}
