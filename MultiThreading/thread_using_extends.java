
// create a thread using extends in java


class myThread1 extends Thread{
    @Override
    public void run(){   //yaha par run method thread class mai hi define hai 
        int i=0;
        while(i<400){
            System.out.println("my Thread1 cooking is Running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("my Thread2 for chatting is Running");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class thread_using_extends {

    public static void main(String[] args) {
        // object
        myThread1 t1=new myThread1();
        myThread2 t2=new myThread2();
        // call method
        t1.start();//yaha par thread ko start karne ke liye start() method ka use hota hai
        t2.start();
        
    }
}