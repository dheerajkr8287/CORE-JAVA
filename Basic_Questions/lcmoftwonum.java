import java.util.Scanner;

public class lcmoftwonum {
    public static int lcm(int firstNum,int secondNum){
        int i=1;
        while (true) {
            int factor=firstNum*i;
            if(factor%secondNum==0){
                return factor;
            }
            i++;
            
        }

        
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int firstNum=sc.nextInt();
        System.out.println("enter the second number:");
        int secondNum=sc.nextInt();
        System.out.println(lcm(firstNum, secondNum));
        
    }
}
