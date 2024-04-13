import java.util.Scanner;

public class sumofdigits {
    public static int sumOfNumber(int num){
        int sum=0;
        while(num>0){
            int modulo=num%10;

            sum=sum+modulo;
            num=num/10;      //automatic typecasting perform float num change into int


        }
        return sum;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(sumOfNumber(num));

        
    }
}
