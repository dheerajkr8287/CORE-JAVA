class first extends Thread{
    public void run(){
        int i=0;
        while(i<1){
            
            // System.out.println("good morning ");
            i++;

        }
    }
}
class second extends Thread{
    public void run(){
        int i=0;
        while(i<1){
            try{

                Thread.sleep(200);
            }
            catch(Exception e)
            {
              System.out.println(e);
            }
            // System.out.println("Welcome ");
            i++;
        }
        
        
    }
}
public class thread_practice {
        public static void main(String[] args) {
        first t1=new first();
        second t2=new second();
        t1.setPriority(5);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());  //new
        System.out.println(t2.getState());  //new 
        t1.start();
        t2.start();  
        System.out.println(t1.getState());//runnable
        System.out.println(t2.getState());//runnable
        // currentThread():returns a reference to the currently exceuting thread object
        System.out.println(Thread.currentThread().getState());//runnable
         
        
    }
}
