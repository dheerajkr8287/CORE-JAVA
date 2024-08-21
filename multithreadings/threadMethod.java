/* 
class mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("thank you");
            try{
                Thread.sleep(444);//The sleep() method in Java is useful to put a thread to sleep for a specified amount of time.
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class mythread2 extends Thread{
    public void run(){
        int i=0;
        while(i<200){
            System.out.println(" mY thank you");
            i++;

        }
    }
}


//A daemon thread is a low-priority thread that runs in the background to perform tasks such as garbage collection or provide services to user threads. Daemon threads are low-priority threads whose only role is to provide services to user threads.

public class threadMethod {
    public static void main(String[] args) {
        mythread1 t1=new mythread1();
        mythread2 t2=new mythread2();

        t1.start();
        // try{
        //     t1.join();  //The join() method in Java allows one thread to wait until the execution of some other specified thread is completed.

        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();


        
    }
}
  */




  //Interrupt() method :


  //Case 1: Interrupting a thread that doesn’t stop working :

//   class CWH1 extends Thread{
//     public void run(){
//         try {
//             for (int i=0;i<5;i++){
//                 System.out.println("Child Thread");
//                 Thread.sleep(4000); /* Child thread is put to sleep for 4000ms. As soon as child thread goes to sleep main thread interrupts it. And, InterruptedException is generated which is handled by the catch block. */

//             }
//         }
//         catch (InterruptedException e)
//         {
//             System.out.println("Child Thread Interrupted");
//         }
// 	System.out.println("Thread is running");

//     }
// }

// public class threadMethod  extends Thread{
//     public static void main(String[] args) {
//          CWH1 t= new CWH1();
//          t.start();
//          t.interrupt();
//         System.out.println("Main Thread");

//     }
// } 


//Case 2: Interrupting a thread that works normally :

class CWH1 extends Thread{
    public void run(){
        for (int i=0;i<10;++i){
            System.out.println(i);
        }
    }
}

public class threadMethod extends Thread{
    public static void main(String[] args) {
         CWH1 t= new CWH1();
         t.start();
         t.interrupt();
        System.out.println("Main Thread");

    }
}
