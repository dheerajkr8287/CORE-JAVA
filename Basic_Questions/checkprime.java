import java.util.Scanner;

public class checkprime {
    public static int primeCheck(int num){
        if(num%2==0){
            System.out.print("your number is not prime:");
        }else{
            System.out.print("your number is prime:");
        }
        return num;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=sc.nextInt();
        System.out.println(primeCheck(num));

    }
}
