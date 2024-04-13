import java.util.Scanner;

public class palindrome {
    public static int reverse(int number){
        int newNum=0;
        while (number>0) {
            int modulo=number%10;
            newNum=newNum*10+modulo;
            number=number/10;
            
        }
    return newNum;
}
public static boolean ispalidrome(int number){
    int reverse =reverse(number);
    return number == reverse;
}

    

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int number=sc.nextInt();
        boolean ispalidrome = ispalidrome(number);
        if(ispalidrome){
            System.out.println("palidrome");
        }else{
            System.out.println("not palidrome");
        }

        

    }
}
