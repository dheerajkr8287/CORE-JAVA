import java.util.Scanner;
class MaxRetriesExceededException extends Exception{
    @Override
    public String toString() {
       return "Max retries is reached";

    }
  
}
public class practiceset {
    public static void main(String[] args)throws MaxRetriesExceededException {
        // 1) java program to demonstrate syntax, logical &runtime errors.


        
        // int a=9   //synyax error



        // logical error
        // System.out.println("2");
        // int n=5;
        // for (int i=1; i<n; i++){

        //     System.out.println(2*i+1);
        // }


        // runtime error
        // Scanner sc=new Scanner(System.in);

        // int b=sc.nextInt();



        // 2) java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.

        // try{
        //     int a=9393/0;
        // }
        // catch(ArithmeticException e){
        //     System.out.println("HaHa");
        // }catch(IllegalArgumentException e){
        //     System.out.println("HeHe");

        // }



        // 3)Write a program that allows you to keep accessing an array until a valid index is given. If max retries exceed 5 print "errors".


        //4,5)
       /*  4) Modify program in Q3 to throw a custom Exception if max retries are reached. 

        5) Wrap the program in Q3 inside a method which throws your custom Exception.
        */

        boolean flag=true;
        int arr[]=new int[5];
        arr[0]=33;
        arr[1]=93;
        arr[2]=3;
        arr[3]=35;
        arr[4]=34;
        
        
        Scanner sc=new Scanner(System.in);
        int i=0;
        while (flag && i<5) {
            try{
                System.out.println("Enter the index:");
                int ind=sc.nextInt();
                System.out.println("the value of arr[ind]:"+arr[ind]);
                if(ind <0 || ind >= arr.length){
                    throw new IllegalArgumentException("invalid index");
                }
                break;
            }
            catch(Exception e){
                System.out.println("invalid index");
                i++;
            
            }
            
            
        }
        if(i>=5){
            System.out.println("Error");
            

        }

        
        if(i>=5){
            // System.out.println("Error");
            throw new MaxRetriesExceededException();

        }






            
        }
    }

