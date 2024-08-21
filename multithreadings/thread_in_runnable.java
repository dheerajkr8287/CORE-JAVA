class MyThreadRunnable1 implements Runnable{
    public void run(){
        for(int i=0;i<500;i++){

            System.out.println("i am thread 1 not a threat one");
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        for(int i=0;i<500;i++){

            System.out.println("i am thread 2 not a threat two");
        }

    }
}



public class thread_in_runnable {
    public static void main(String[] args) {
       MyThreadRunnable1  Bullet1=new MyThreadRunnable1();
       Thread gun1=new Thread(Bullet1);
       MyThreadRunnable2  Bullet2=new MyThreadRunnable2();
       Thread gun2=new Thread(Bullet2);


       gun1.start();
       gun2.start();
       
    }
    
}
