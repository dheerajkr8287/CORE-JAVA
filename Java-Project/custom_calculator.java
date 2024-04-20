// Doubt:

// In this code I have doubt that ,when we call all the method at a time but any how one of exception is come then below rest of method how we can run .I want that while any of exception is come it print then skip after rest of its below method is run .



import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
       return "invalid Input can not get 8 & 9 ";
    }
}
class ArithmeticException extends Exception{
    @Override
    public String toString() {
       return "invalid input b!==0 ";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
       return "invalid input a!>100000 ||b!>100000";
    }
}
class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString() {
       return "invalid input a!>7000 ||b!>7000";
    }
}

class CustomCalculator {


    double add(double a, double b)throws InvalidInputException,MaxInputException{
        if(a>100000 || b>100000){
            
            throw new MaxInputException();
            
        }
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
    return a+b;
    
    }
    double subtract(double a, double b) throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
    return a-b;
    
    }
    double multiply(double a, double b) throws MaxInputException,MaxMultiplierReachedException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a>7000||b>7000){
            throw new MaxMultiplierReachedException();


        }
    return a*b;
    
    }
    double divide(double a, double b)throws ArithmeticException ,MaxInputException {
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            try{

                throw new ArithmeticException();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        return a/b;
    
    }
} 

public class custom_calculator{
    public static void main(String[] args) throws InvalidInputException,ArithmeticException,MaxInputException,MaxMultiplierReachedException{
        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a=sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b=sc.nextDouble();

         CustomCalculator  c=new CustomCalculator();
         System.out.println("Addition:"+c.add(a,b));
         System.out.println("Subtraction:"+c.subtract(a,b));
         System.out.println("Multiply:"+c.multiply(a,b));
         System.out.println("division:"+c.divide(a,b));
        



        



        
    }
}
