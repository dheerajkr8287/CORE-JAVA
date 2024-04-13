import java.util.Scanner;

public class reverseofnumber {
    public static int reverseOfNumber(int num){
        int newNum=0;
        while(num>0){
            int modulo=num%10;
        
                newNum=newNum*10+modulo;

            

            num=num/10;      //automatic typecasting perform float num change into int


        }
        return newNum;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(reverseOfNumber(num));

        
    }
}
