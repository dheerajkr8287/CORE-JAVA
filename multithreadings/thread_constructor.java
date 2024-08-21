// constructor in thread class




// 3) Using the Thread Class: Thread(String Name)
/* 
class mythr extends Thread{
    // constructor
    public mythr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("I am a thread");
            i++;
        }
    }

}

public class thread_constructor {
   public static void main(String[] args) {
    mythr t1=new mythr("harry");
    t1.start();
    System.out.println("the Id is "+t1.getId());
    System.out.println(t1.getName());
    mythr t2=new mythr("devil");
    t2.start();
    System.out.println("the Id is "+t2.getId());
    System.out.println(t2.getName());
    
   }
    
}
 */






// 4) Using the Thread Class: Thread(Runnable r, String name)


class myThread2 implements Runnable{
    String name;
    public myThread2(String n){
        this.name=n;

    }

    public void run(){
        System.out.println("Thread " + this.name + " is running...");
    }

}
public class thread_constructor {
public static void main(String[] args) {
// creating an object of the class MyThread2  
myThread2 bullet=new myThread2("dheeraj");
// creating an object of the class Thread using Thread(Runnable r, String name)  
Thread gun=new Thread(bullet,bullet.name);
gun.start();

// getting the thread name by invoking the getName() method  
System.out.println("the name of thread is:"+gun.getName());

// getting the thread id by invoking the getId() method
// System.out.println("the id of thread is:"+gun.getId());

    
}
    
}




/*
 * myThread2 implements the Runnable interface and has a member variable name to store the thread name.
The myThread2 class constructor takes the thread name as an argument and initializes the name variable.
The run() method of myThread2 is overridden to define the behavior of the thread when it starts. It prints a message indicating that the thread is running.
In the main() method:
An instance bullet of myThread2 is created with the thread name "my new thread".
A new Thread instance gun is created using the Thread(Runnable r, String name) constructor, where r is bullet (which is a Runnable) and the name is bullet.name.
The gun thread is started using gun.start().
The name of the thread is retrieved using gun.getName() and printed out.





 */
