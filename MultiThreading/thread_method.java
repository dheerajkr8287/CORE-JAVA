class myThread1 extends Thread{
    
    public void run(){
        int i=1;
        while(i<1000){
            System.out.println("Thank you 1...");
            try{
            Thread.sleep(455);//sleep()	It sleeps a thread for the specified amount of time.
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }

}

/*
* A daemon thread is a low-priority thread that runs in the background to perform tasks such as garbage collection or provide services to user threads. Daemon threads are low-priority threads whose only role is to provide services to user threads.
*/

class myThread2 extends Thread{

    public void run(){
        int i=1;
        while(i<1000){
            System.out.println("Thank you 2...");
            i++;
        }
    }

}

public class thread_method {
public static void main(String[] args) {
    myThread1 t1=new myThread1();
    myThread2 t2=new myThread2();
    t1.start();
    // try{
    //     t1.join(); //It waits for a thread to die.

    // }
    // catch(Exception e){
    //     System.out.println(e);

    // }
    t2.start();
}
}
