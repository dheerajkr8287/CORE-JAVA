
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can not be negative";

    }
    @Override
    public String getMessage(){
        return "Radius can not be negative";
    }
}


public class throwand_throws {

    public static double area(int r)throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result=Math.PI * r *r;
        return result;
    }

    public static int divide(int a,int b) throws ArithmeticException{
        // made by harry
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        // shivam -use divide function created by harrry
        try{

            // int c=divide(6, 0);
            // System.out.println(c);
            double ar=area(-6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        
        
    }
}



/*Throws java throws keyword is used to declare an exception.

This gives an information to the programmer that there might be an exception so its better to be prepared with a try catch block!
*/

//The throw keyword is used to throw an exception explicitly by the programmer

