import java.util.Scanner;
class MaxRetriesExceededException extends Exception{
    public String toString(){
        return "Max tries are recahed";
    }
    public String getMessage(){
        return "Max tries are recahed";
    }
}
public class practiceset14 {
    public static void main(String[] args) throws MaxRetriesExceededException {
        // 1) java program to demonstrate syntax, logical &runtime errors.

        // syntax eroor
        // int a=3
        // System.out.println(a);


        // logical error
        // System.out.println("prime no");
        // System.out.println(2);
        // for(int i=2;i<10;i++){
        //    System.out.println(2*i+1);
        // }


        // runtime error
        //    System.out.println(2/0); 


        //problem 2:
        // 2) java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.


      /*   try{
            int a=444/0;
            System.out.println(a);
        }
        catch(IllegalArgumentException e){
            System.out.println("HAHA" );

        }
        catch(ArithmeticException e){
            System.out.println("HEEE");
        } */





        // problem 3:Write a program that allows you to keep accessing an array until a valid index is given. If max retries exceed 5 print "errors".
        //4,5)
       /*  4) Modify program in Q3 to throw a custom Exception if max retries are reached. 

        5) Wrap the program in Q3 inside a method which throws your custom Exception.
        */
        
        
        boolean flag=true;
        int arr[]=new int[3];
        arr[0]=11;
        arr[1]=22;
        arr[2]=223;
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(flag&&i<5 ){
        try{

            System.out.println("enter the value of ind");
            int ind=sc.nextInt();
            System.out.println(arr[ind]);
            // flag=false;
            break;
        }
        
        catch(Exception e){
            System.out.println("Exception error");
            // System.out.println(e);
            i++;
            
        }
    }
    
    if(i>=5){
        try{
            
            throw new MaxRetriesExceededException();
        }catch(Exception e){
            
            System.out.println("Error........................");
            System.out.println(e);
        }
    } 

   




    }
}
