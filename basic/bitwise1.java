import java.util.Scanner;

public class bitwise1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("please enter the first number:");
        // int first=sc.nextInt();
        // System.out.println("please enter the second number:");
        // int second=sc.nextInt();
        // bitwise And 

        // int result=first&second;
        // System.out.println(result);

        // bitwise OR

        //  int result=first | second;
        //  System.out.println(result);


        // bitwise xor

        // int result=first ^ second;
        // System.out.println(result);

        // complement
        // int result= ~first;
        // System.out.println(result);


        // left shift
        // int result= first << 1;
        // System.out.println(result);


        // right shift
        // int result= first >> 1;
        // System.out.println(result);

        // odd and even problem by bitwise 

        System.out.println("enter your number:");
        int num=sc.nextInt();
        if((num & 1)==1){
            System.out.println("given number is odd :"+num);
        }
        else{
            System.out.println("given number is even:"+num);
        }



sc.close();


        
    }
}

