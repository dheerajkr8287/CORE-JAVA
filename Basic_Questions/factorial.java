import java.util.Scanner;

public class factorial {

    public static long factorialFind(int num){
        int i=num;
        long fact=1;
        while(i>0){
            fact=fact*i;
            i--;
        }
        return fact;



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int num=sc.nextInt();
        System.out.println(factorialFind(num));
    }
}
