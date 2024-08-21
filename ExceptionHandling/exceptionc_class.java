import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString() {
        return "I am toString";
    }

    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}


class maxAgeException extends Exception{
    @Override
    public String toString() {
        return "age cannot br greater than 125";
    }

    @Override
    public String getMessage(){
        return "make sure that the value of age entered is correct ";
    }
}
public class exceptionc_class {
        public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        if(a<9){
            //throw keyword is used to throw an exception explicitly by the programmer
            try{

                // throw new myException();
                // throw new ArithmeticException("this is an exception");
                throw new maxAgeException();
            }
            catch(Exception e){ 
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e); //e:tostring method run
                e.printStackTrace();//find error on which line
                System.out.println("Finished");
            }

            System.out.println("yes finished");
        }
    }
}