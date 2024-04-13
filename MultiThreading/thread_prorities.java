/*
 * Background Information: Java Threads
The JVM defines a range of ten logical priorities for Java threads, including:

java.lang.Thread.MIN_PRIORITY  = 1
java.lang.Thread.NORM_PRIORITY = 5
java.lang.Thread.MAX_PRIORITY  = 10
These values [1..10] are passed into Thread.setPriority(int) to assign priorities to Java threads. The default priority of a Java thread is NORM_PRIORITY. (A Java thread that doesn't explicitly call setPriority runs at NORM_PRIORITY.) A JVM is free to implement priorities in any way it chooses, including ignoring the value.


 */
class myThread1 extends Thread{
    public myThread1(String name ){
        super(name);
    }
    public void run(){
        int i=1;
        while(i<100){
            System.out.println("Thank you:"+this.getName());
            i++;
        }
    }
}
public class thread_prorities {
    public static void main(String[] args) {
        // ready Queue:T1,T2,T3,T4,T5
        myThread1 t1=new myThread1("harry1");
        myThread1 t2=new myThread1("harry2");
        myThread1 t3=new myThread1("harry3");
        myThread1 t4=new myThread1("harry4");
        myThread1 t5=new myThread1("harry5 (Most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
