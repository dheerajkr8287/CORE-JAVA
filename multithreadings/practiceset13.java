
class mythread extends Thread{
    public void run(){
        int i=0;
        
        while(i<100){
            try{
                Thread.sleep(220);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Good morning..");


            i++;
        }
    }
}

// IllegalArgumentException - if the value of millis is negative, or the value of nanos is not in the range 0-999999


// InterruptedException - if any thread has interrupted the current thread. The interrupted status of the current thread is cleared when this exception is thrown.



class mythread2  extends Thread{
    public  void run(){
        int i=0;
        
        while(i<100){
            try{
                Thread.sleep(200);//The sleep() method in Java is useful to put a thread to sleep for a specified amount of time.
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome ");


            i++;
        } 
    }
   } 




public class practiceset13 {
    public static void main(String[] args) {
        mythread th=new mythread();
        mythread2 th2=new mythread2();
        // th.setPriority(6);
        // th2.setPriority(9);
        // System.out.println(th.getPriority());
        // System.out.println(th2.getPriority());
        System.out.println(th.getState());//new
        System.out.println(th2.getState());//new
        th.start();
        th2.start();
        System.out.println(th.getState()); //runnable
        System.out.println(th2.getState());  //runnable
        System.out.println(Thread.currentThread().getState());  //runnable
 
        
    }
}
