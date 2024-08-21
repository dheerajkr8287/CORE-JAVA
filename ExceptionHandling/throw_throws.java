class negativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius canot be negative";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative";
    }
}


public class throw_throws {
    public static int divide(int a,int b) throws ArithmeticException{
        // made by harry
        int result=a/b;
        return result;
    }

   //throw:keyword us used to throw an exception explicitly by the programmer also define custom and user define exception


   //throws:Throws java throws keyword is used to declare an exception.
            //This gives an information to the programmer that there might be an exception so its better to be prepared with a try catch block!
    public static double area(int r) throws negativeRadiusException{
        if(r<0){
            throw new negativeRadiusException();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static void main(String[] args) {
        // shivm -uses divide function created by harry

        try{
            // int c=divide(6, 0);
            // System.out.println(c);
            double ar=area(-1);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("exception");
        }
    }
}
