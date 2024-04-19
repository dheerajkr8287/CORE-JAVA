import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }

}


public class exception_class {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        if(a<9){
            try{

                // throw new myException();
                throw new ArithmeticException("This is an Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                // System.out.println(e);//yaha par toString method run hoga
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes finished");
        }
        
    }
}
