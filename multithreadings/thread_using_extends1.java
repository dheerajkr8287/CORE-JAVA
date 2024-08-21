
class MyThread1 extends Thread{
    @Override
    public void run(){ //yaha par run method thread class mai define hai so override ki gya h bss
        int i=0;
     while(i<400){
        System.out.println("My cooking thread is Running ");
        System.out.println("i am happy");
        i++;
     }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
     while(i<400){
        System.out.println("thread 2 for chatting with her ");
        System.out.println("i am sad");
        i++;
     }
    }
}


public class thread_using_extends1 {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start(); //for start the method
        t2.start();


    }
}
