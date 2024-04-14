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






/*
Interrupt() method :
A thread in a sleeping or waiting state can be interrupted by another thread with the help of the interrupt() method of the Thread class.
The interrupt() method throws InterruptedException.
The interrupt() method will not throw the InterruptedException if the thread is not in the sleeping/blocked state, but the interrupt flag will be changed to true.
Syntax :
Public void interrupt()
*/



/*class CWH1 extends Thread{
    public void run(){
        try {
            for (int i=0;i<5;i++){
                System.out.println("Child Thread");
                Thread.sleep(4000); //Child thread is put to sleep for 4000ms. As soon as child thread goes to sleep main thread interrupts it. And, InterruptedException is generated which is handled by the catch block. 

            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Child Thread Interrupted");
        }
	System.out.println("Thread is running");

    }
}

public class thread_method extends Thread{
    public static void main(String[] args) {
         CWH1 t= new CWH1();
         t.start();
         t.interrupt();
        System.out.println("Main Thread");

    }
}
*/

/*
In the above code, the for loop runs for the first time, but the child thread is put to sleep after that. 
So, the main() method interrupts the child thread, and InterruptedException is generated.
Here, the child thread comes out of the sleeping state, but it does not stop working.
*/

