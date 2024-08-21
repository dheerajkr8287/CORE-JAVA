import java.util.Scanner;

// Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method.

public class recursion {
    // factorial(0)=1
    // factorial(n)=n*n-1*...1
    // factorial(n)=n*factorial(n-1)

    //  factorial using recurssion
    static long factorial(long n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);  //recursion
        }
    }

    // factorial using loop
    static long factorial_loop(long n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product=1;
            for(int i=1;i<=n;i++){
                product*=i;
            }
            return product;
        }
        
    }

    // fabonacii series:In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.


    //fabonacii using loop 
  /*   static int fabonacii_loop(){
        
         int  count=10;
         int  n1=0;
         int  n2=1;
         int n3=0;
         System.out.println(n1);
         System.out.println(n2);
         for(int i=2;i<count;i++){
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
           }
           return n3;
    } */


    // fabpnacii using recursion
    static int n1=0,n2=1,n3=0;
    static void fabonacii_recursion(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(""+n3);
            fabonacii_recursion(count-1);
        }
        
       
        
    }
    
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("enter the value:");
        // long x=sc.nextInt();
        // System.out.println("the value of factorials x is:"+factorial(x));
        // System.out.println("the value of factorialsloop x is:"+factorial_loop(x));
        
        // System.out.println("fabonacii  using loop is:");
        // fabonacii_loop();
        int count=10;
       System.out.println(n1);
       System.out.println(n2);
       fabonacii_recursion(count-2);
       
        
        
    }
}
