import java.util.Scanner;
class negativeValueException extends Exception{
    @Override
    public String toString() {
        return "Negative value found";
    }
    
}
class InvalidInputException extends Exception{
    @Override
    public String toString() {
       return "invalid Input can not get 8 & 9 ";
    }
}

class maxMultiplierReached extends Exception{
    @Override
    public String toString() {
       return "invalid input a!>7000 ||b!>7000";
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

  public class customCalculator{





    // Method to check if input is a number
    public static boolean isNumeric(String str) {
        try {
            //The inputs are converted from strings to double using Double.parseDouble.

            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


   
    public double Addtion(double a,double b) throws InvalidInputException,MaxInputException{
        if(a>100000 && b>100000){
            throw new MaxInputException();

        }


        if((a==8 && a==9) || (a==9 && b==8)){
            throw new InvalidInputException();
        }
        return a+b;


        
    }
    public double subtraction(double a,double b) throws negativeValueException,MaxInputException{
        if(a>100000 && b>100000){
            throw new MaxInputException();

        }

        if(a-b<0 || a<0 ||b<0){
            throw  new negativeValueException();
            
        }

        return a-b;
        
    }
    public double Multiply(double a,double b) throws maxMultiplierReached,MaxInputException{
        if(a>100000 && b>100000){
            throw new MaxInputException();

        }
       
        if(a>7000||b>7000){
            throw new maxMultiplierReached();


        }
    return a*b;

        
    }
    public double divide(double a,double b) throws ArithmeticException,MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new ArithmeticException();

        }
        return a/b;
    
        
    }
    public static void main(String[] args) throws InvalidInputException,negativeValueException,maxMultiplierReached,MaxInputException,ArithmeticException{
        Scanner sc=new Scanner(System.in);
        customCalculator c=new customCalculator();

       /*  System.out.println("Enter the value of a:");
        double a=sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b=sc.nextDouble();

        System.out.println("addition:"+c.Addtion(a, b));
        System.out.println("Subtraction:"+c.subtraction(a,b));
        System.out.println("Multiply:"+c.Multiply(a,b));
        System.out.println("division:"+c.divide(a,b)); */



        try {
            System.out.println("Enter the value of a:");
            String inputA = sc.next();
            System.out.println("Enter the value of b:");
            String inputB = sc.next();

            if (!isNumeric(inputA) || !isNumeric(inputB)) {
                throw new InvalidInputException();
            }
            double a = Double.parseDouble(inputA);
            double b = Double.parseDouble(inputB);


            System.out.println("Addition: " + c.Addtion(a, b));
            System.out.println("Subtraction: " + c.subtraction(a, b));
            System.out.println("Multiply: " + c.Multiply(a, b));
            System.out.println("Division: " + c.divide(a, b));

        } catch (InvalidInputException | negativeValueException | maxMultiplierReached | MaxInputException | ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        } finally {
            sc.close();
        }
    }
  
               
    }




















//example of parse() method

    //string str="12";
    // int num3=Integer.parseInt(str);
     //System.out.println(num3*2);
