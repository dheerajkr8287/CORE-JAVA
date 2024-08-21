import java.util.Scanner;

public class practice_set_1 {
    public static void main(String[] args) {
        

        //problem 1
/* 
        // Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int sum=a+b+c;
        System.out.println(sum); */



        //problem 2

        /* Scanner sc=new Scanner(System.in);
        System.out.println("enter the name please:");
        String name=sc.nextLine();
        System.out.println("hello"+name+",have a good day "); */

       //problem 3:convert kilometer into miles
       
       /* System.out.println("please enter kilometer");
       Scanner sc=new Scanner(System.in);
       double kilometer=sc.nextDouble();
       double miles=kilometer/1.6;
       System.out.println(miles);
 */


      // problem:detect whether a number entered by user is interger or not

        /* Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        System.out.println(sc.hasNextInt()); */

          
      //PRACTICE SET -2


        //encrypt a grade by 8 .then decrypt it 
       /*  char grade='B';
        grade=(char)(grade+8);
        System.out.println(grade);

        // decrypting the grade
        grade=(char)(grade-8);
        System.out.println(grade); */



        // given number is greater than user number or not
        /* Scanner sc=new Scanner(System.in);
        int userNum=sc.nextInt();
        int givenNum=16;
        System.out.println(givenNum>userNum?true:false);
 */



        //EXPRSSION
       // Values for v, u, a, and s
       double v = 10.0; // Example value for v
       double u = 5.0;  // Example value for u
       double a = 2.0;  // Example value for a
       double s = 3.0;  // Example value for s

       // Calculate the expression (v*v - u*u) / (2 * a * s)
       double result = (v * v - u * u) / (2 * a * s);

       // Print the result
       System.out.println("The result of the expression (v*v - u*u) / (2 * a * s) is: " + result);
   
       }
}
