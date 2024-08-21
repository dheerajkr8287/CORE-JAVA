public class finallyblock {

    public static int greet(){
        try{
            // int a=20;
            // int b=0;
            // int c=a/b;
            // return c;
            for(int i=0;i<5;i++){
                if(i==4){
                    break;
                }
                System.out.println(i);
            }
            

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("cleaning up resource...........");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k=greet();
        System.out.println(k);
    }
}











/* Finally block contains the code which is always executed whether the exception is handled or not.

It is used to exception is handled or not.

It is used to execute code containing instructions to release the system resources, close a connection etc. */