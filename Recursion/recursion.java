import java.util.Scanner;

public class recursion {
    // factorial(0)=1
    // factorial(n)=n*n-1*...1
    // factorial(n)=n*factorial(n-1)
    static long factorial(long n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value:");
        long x=sc.nextInt();
        System.out.println("the value of factorials x is:"+factorial(x));
        
    }
}
