import java.util.Scanner;

// Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method.

public class recursion1 {
    // method to print 5 to 1
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);   //recursion
        }
        // method to print 1 to 5
        static void number(int num){
            if(num==6){
                return;
            }
            System.out.println(num);
            number(num+1);   //recursion
        }

        // method to print sum of natural number
        static void printSum(int i,int nu,int sum){
            if(i==nu){
                sum=sum+i;
                System.out.println(sum);
                return;

            }
            sum=sum+i;
            printSum(i+1, nu, sum);   //recursion
        }


        // method to print factorial of given no

        static int factorial(int number){
            if(number==0 || number==1){    //base case 
                return 1;

            }
            int fact_nm1=factorial(number-1);
            int fact_n=number*factorial(number-1);   //recursion
            return fact_n;
        }

        // method fabonacii series

        static void fabonacii(int a,int b,int no){
            if(no==0){
                return;
            }
            int c=a+b;
            System.out.println(c);
            fabonacii(b, c, no-1);
        }

        // method to print  x^n(stack height=n)
        static int calcPower(int x,int n){
            if(n==0){
                return 1;
            }
            if(x==0){
                return 0;
            }
            int xPownm1=calcPower(x, n-1);
            int xpown=x*xPownm1;
            return xpown;
        }


        // method print  x^n (stack height=logn )
        static int calPower(int z,int po){
            if(po==0){
                return 1;
            }
            if(z==0){
                return 0;
            }
            // if p is even 
            if(po%2==0){
                return calPower(z, po/2) * calPower(z, po/2);

            }
            else{
                return calPower(z, po/2) * calPower(z, po/2)*z;


            }
        }

    public static void main(String[] args) {
        // print value 5 to 1
        // int n=5;
        // printNum(n);


        // print value 1 to 5
        // int num=1;
        // number(num);


        // print the sum of n natural number
        // printSum(1, 5, 0);

        // calculate the factorial
        // System.out.println(factorial(5));



        // fabonacii series 


        // int a=0;
        // int b=1;
        // System.out.println("first term:"+a);
        // System.out.println("second term:"+b);
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter how many term you want:");
        // int n=sc.nextInt();
        // fabonacii(a, b, n-2);



        // print  x^n(stack height =n)

        // Scanner sc=new Scanner(System.in);
        // System.out.print("enter the value of x:");
        // int x=sc.nextInt();
        // System.out.print("enter the value of power:");
        // int n=sc.nextInt();
        // int ans=calcPower(x, n);
        // System.out.println(ans);




         // print  x^n(stack height =logn)
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of z:");
        int z=sc.nextInt();
        System.out.print("enter the value of power:");
        int po=sc.nextInt();
        int ans=calcPower(z, po);
        System.out.println(ans);



    }
}
